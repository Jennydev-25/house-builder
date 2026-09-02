package dev.jenny.house.builder;

import dev.jenny.house.models.House;

public interface IHouseBuilder {

    public HouseBuilder hasGarage(Boolean hasGarage);
    public HouseBuilder hasGarden(Boolean hasGarden);
    public HouseBuilder hasPool(Boolean hasPool);
    public HouseBuilder hasStatues(Boolean hasStatues);

    public House build();
}
