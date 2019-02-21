package ua.lviv.iot.sportBuildings.models;

public class ShootingPlayground extends SportBuilding {

    private int bowsNumber;
    private int targetsNumber;
    private int arrowsNumber;

    public ShootingPlayground() {}

    public ShootingPlayground(int bowsNumber, int targetsNumber, int arrowsNumber) {
        this.bowsNumber = bowsNumber;
        this.targetsNumber = targetsNumber;
        this.arrowsNumber = arrowsNumber;
    }

    public ShootingPlayground(String name, String location, int constructionYear, SportSeason sportSeason,
                              int viewersNumber, SportKind sportKind, int bowsNumber, int targetsNumber,
                              int arrowsNumber) {
        super(name, location, constructionYear, sportSeason, viewersNumber, sportKind);
        this.bowsNumber = bowsNumber;
        this.targetsNumber = targetsNumber;
        this.arrowsNumber = arrowsNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ShootingPlayground{" +
                "bowsNumber=" + bowsNumber +
                ", targetsNumber=" + targetsNumber +
                ", arrowsNumber=" + arrowsNumber +
                '}';
    }

    public int getBowsNumber() {
        return bowsNumber;
    }

    public void setBowsNumber(int bowsNumber) {
        this.bowsNumber = bowsNumber;
    }

    public int getTargetsNumber() {
        return targetsNumber;
    }

    public void setTargetsNumber(int targetsNumber) {
        this.targetsNumber = targetsNumber;
    }

    public int getArrowsNumber() {
        return arrowsNumber;
    }

    public void setArrowsNumber(int arrowsNumber) {
        this.arrowsNumber = arrowsNumber;
    }
}
