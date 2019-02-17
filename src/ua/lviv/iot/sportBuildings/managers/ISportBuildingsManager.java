package ua.lviv.iot.sportBuildings.managers;

import ua.lviv.iot.sportBuildings.models.SportBuilding;

import java.util.List;

public interface ISportBuildingsManager {

    public List<SportBuilding> findByViewersNumber(int min, int max);

    public void sortBySportKind(List<SportBuilding> sportBuildings);

    public void sortBySportSeason(List<SportBuilding> sportBuildings);

    public void printSportBuildingsInfo(List<SportBuilding> sportBuildings);
}
