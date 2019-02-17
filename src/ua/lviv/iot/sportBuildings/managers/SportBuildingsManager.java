package ua.lviv.iot.sportBuildings.managers;

import ua.lviv.iot.sportBuildings.models.SportBuilding;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SportBuildingsManager implements ISportBuildingsManager, Serializable {

    private List<SportBuilding> sportBuildings;

    public SportBuildingsManager() {}

    public SportBuildingsManager(List<SportBuilding> sportBuildings) {
        this.sportBuildings = sportBuildings;
    }

    @Override
    public List<SportBuilding> findByViewersNumber(int min, int max) {
        return sportBuildings.stream()
                .filter(sportBuilding
                        -> sportBuilding.getViewersNumber() >= min && sportBuilding.getViewersNumber() <= max)
                .collect(Collectors.toList());
    }

    @Override
    public void sortBySportKind(List<SportBuilding> sportBuildings) {
        Comparator<SportBuilding> sportKindComparator = (obj1, obj2)
                -> obj1.getSportKind().compareTo(obj2.getSportKind());
        sportBuildings.sort(sportKindComparator);
    }

    @Override
    public void sortBySportSeason(List<SportBuilding> sportBuildings) {
        Comparator<SportBuilding> sportSeasonComparator = (obj1, obj2)
                -> obj1.getSportSeason().compareTo(obj2.getSportSeason());
        sportBuildings.sort(sportSeasonComparator);
    }

    @Override
    public void printSportBuildingsInfo(List<SportBuilding> sportBuildings) {
        sportBuildings.forEach(sportBuilding -> System.out.println(sportBuilding.toString()));
    }

    public List<SportBuilding> getSportBuildings() {
        return sportBuildings;
    }

    public void setSportBuildings(List<SportBuilding> sportBuildings) {
        this.sportBuildings = sportBuildings;
    }
}
