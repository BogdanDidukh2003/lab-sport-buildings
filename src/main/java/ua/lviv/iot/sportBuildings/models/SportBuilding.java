package ua.lviv.iot.sportBuildings.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public abstract class SportBuilding {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;
    private String location;
    private int constructionYear;
    private SportSeason sportSeason;
    private int viewersNumber;
    private SportKind sportKind;

    public SportBuilding() {
    }

    public SportBuilding(String name, String location, int constructionYear,
                         SportSeason sportSeason, int viewersNumber, SportKind sportKind) {
        this.name = name;
        this.location = location;
        this.constructionYear = constructionYear;
        this.sportSeason = sportSeason;
        this.viewersNumber = viewersNumber;
        this.sportKind = sportKind;
    }

    public String getHeaders() {
        return "name" + ","
                + "location" + ","
                + "constructionYear" + ","
                + "sportSeason" + ","
                + "viewersNumber" + ","
                + "sportKind";
    }

    public String toCSV() {
        return this.name + ","
                + this.location + ","
                + this.constructionYear + ","
                + this.sportSeason + ","
                + this.viewersNumber + ","
                + this.sportKind;
    }

    @Override
    public String toString() {
        return "SportBuilding{"
                + "name='" + name + '\''
                + ", location='" + location + '\''
                + ", constructionYear=" + constructionYear
                + ", sportSeason=" + sportSeason
                + ", viewersNumber=" + viewersNumber
                + ", sportKind=" + sportKind + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    public SportSeason getSportSeason() {
        return sportSeason;
    }

    public void setSportSeason(SportSeason sportSeason) {
        this.sportSeason = sportSeason;
    }

    public int getViewersNumber() {
        return viewersNumber;
    }

    public void setViewersNumber(int viewersNumber) {
        this.viewersNumber = viewersNumber;
    }

    public SportKind getSportKind() {
        return sportKind;
    }

    public void setSportKind(SportKind sportKind) {
        this.sportKind = sportKind;
    }
}
