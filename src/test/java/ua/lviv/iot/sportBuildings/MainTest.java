package ua.lviv.iot.sportBuildings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class MainTest {

    @Test
    void testCreateSportBuildingsList() {
        assertNotNull(Main.createSportBuildingsList());
    }
}
