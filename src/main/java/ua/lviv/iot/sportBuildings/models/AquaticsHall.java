package ua.lviv.iot.sportBuildings.models;

public class AquaticsHall extends SportBuilding {

    private int poolsNumber;
    private double averagePoolVolume;

    public AquaticsHall() {}

    public AquaticsHall(int poolsNumber, double averagePoolVolume) {
        this.poolsNumber = poolsNumber;
        this.averagePoolVolume = averagePoolVolume;
    }

    public AquaticsHall(String name, String location, int constructionYear, SportSeason sportSeason,
                        int viewersNumber, SportKind sportKind, int poolsNumber, double averagePoolVolume) {
        super(name, location, constructionYear, sportSeason, viewersNumber, sportKind);
        this.poolsNumber = poolsNumber;
        this.averagePoolVolume = averagePoolVolume;
    }

    public int getPoolsNumber() {
        return poolsNumber;
    }

    public void setPoolsNumber(int poolsNumber) {
        this.poolsNumber = poolsNumber;
    }

    public double getAveragePoolVolume() {
        return averagePoolVolume;
    }

    public void setAveragePoolVolume(double averagePoolVolume) {
        this.averagePoolVolume = averagePoolVolume;
    }
}
