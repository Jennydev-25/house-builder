package dev.jenny.house.builder;

public class HouseDirector {

    public void constructBasicHouse(IHouseBuilder houseBuilder) {
        houseBuilder
                .hasGarage(false)
                .hasGarden(false)
                .hasPool(false)
                .hasStatues(false);
    }

    public void constructHouseWithGarage(IHouseBuilder houseBuilder) {
        houseBuilder
                .hasGarage(true)
                .hasGarden(false)
                .hasPool(false)
                .hasStatues(false);
    }

    public void constructHouseWithGarden(IHouseBuilder houseBuilder) {
        houseBuilder
                .hasGarage(false)
                .hasGarden(true)
                .hasPool(false)
                .hasStatues(false);
    }

    public void constructHouseWithPool(IHouseBuilder houseBuilder) {
        houseBuilder
                .hasGarage(false)
                .hasGarden(false)
                .hasPool(true)
                .hasStatues(false);
    }

    public void constructHouseWithStatues(IHouseBuilder houseBuilder) {
        houseBuilder
                .hasGarage(false)
                .hasGarden(false)
                .hasPool(false)
                .hasStatues(true);
    }

    public void constructLuxuryHouse(IHouseBuilder houseBuilder) {
        houseBuilder
                .hasGarage(true)
                .hasGarden(true)
                .hasPool(true)
                .hasStatues(true);
    }
}
