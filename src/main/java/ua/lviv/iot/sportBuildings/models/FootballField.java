package ua.lviv.iot.sportBuildings.models;

public class FootballField extends SportBuilding {

    private double fieldWidth;
    private double fieldLength;

    public FootballField() {}

    public FootballField(double fieldWidth, double fieldLength) {
        this.fieldWidth = fieldWidth;
        this.fieldLength = fieldLength;
    }

    public FootballField(String name, String location, int constructionYear, SportSeason sportSeason,
                         int viewersNumber, SportKind sportKind, double fieldWidth, double fieldLength) {
        super(name, location, constructionYear, sportSeason, viewersNumber, sportKind);
        this.fieldWidth = fieldWidth;
        this.fieldLength = fieldLength;
    }

    public double getFieldWidth() {
        return fieldWidth;
    }

    public void setFieldWidth(double fieldWidth) {
        this.fieldWidth = fieldWidth;
    }

    public double getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(double fieldLength) {
        this.fieldLength = fieldLength;
    }
}
