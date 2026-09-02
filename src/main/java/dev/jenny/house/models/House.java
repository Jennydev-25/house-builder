package dev.jenny.house.models;

public class House {

    private Boolean hasGarage;
    private Boolean hasGarden;
    private Boolean hasPool;
    private Boolean hasStatues;

    public House(Boolean hasGarage, Boolean hasGarden, Boolean hasPool, Boolean hasStatues) {
        this.hasGarage = hasGarage;
        this.hasGarden = hasGarden;
        this.hasPool = hasPool;
        this.hasStatues = hasStatues;
    }

    public Boolean getHasGarage() {
        return hasGarage;
    }

    public Boolean getHasGarden() {
        return hasGarden;
    }

    public Boolean getHasPool() {
        return hasPool;
    }

    public Boolean getHasStatues() {
        return hasStatues;
    }
}
