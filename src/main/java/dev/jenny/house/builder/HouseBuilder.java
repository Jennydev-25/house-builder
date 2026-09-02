package dev.jenny.house.builder;

import dev.jenny.house.models.House;

public class HouseBuilder implements IHouseBuilder {

    private final House house;

    public HouseBuilder() {
        house = new House();
    }

    @Override
    public HouseBuilder hasGarage(Boolean hasGarage) {
        house.setHasGarage(hasGarage);
        return this;
    }

    @Override
    public HouseBuilder hasGarden(Boolean hasGarden) {
        house.setHasGarden(hasGarden);
        return this;
    }

    @Override
    public HouseBuilder hasPool(Boolean hasPool) {
        house.setHasPool(hasPool);
        return this;
    }

    @Override
    public HouseBuilder hasStatues(Boolean hasStatues) {
        house.setHasStatues(hasStatues);
        return this;
    }

    @Override
    public House build() {
        return house;
    }

}
