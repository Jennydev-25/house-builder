package dev.jenny.house.builder;

public class HouseDirector {

    public void constructBasicHouse(IHouseBuilder houseBuilder) {
        houseBuilder
                .hasGarage(false)
                .hasGarden(false)
                .hasPool(false)
                .hasStatues(false);
    }

}
