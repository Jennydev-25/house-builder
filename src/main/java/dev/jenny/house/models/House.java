package dev.jenny.house.models;

public class House {

    private Boolean hasGarage;
    private Boolean hasGarden;
    private Boolean hasPool;
    private Boolean hasStatues;

    public House() {
    }

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

    public void setHasGarage(Boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public void setHasGarden(Boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public void setHasPool(Boolean hasPool) {
        this.hasPool = hasPool;
    }

    public void setHasStatues(Boolean hasStatues) {
        this.hasStatues = hasStatues;
    }

}
