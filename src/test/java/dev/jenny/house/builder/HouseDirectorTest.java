package dev.jenny.house.builder;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.jenny.house.models.House;

public class HouseDirectorTest {

    private HouseDirector houseDirector;
    private HouseBuilder houseBuilder;

    @BeforeEach
    void setUp() {
        houseDirector = new HouseDirector();
        houseBuilder = new HouseBuilder();
    }

    @Test
    void testConstructBasicHouse_ShouldCreateHouseWithNoAttributes() {
        houseDirector.constructBasicHouse(houseBuilder);
        House house = houseBuilder.build();

        assertThat(house.getHasGarage(), is(equalTo(false)));
        assertThat(house.getHasGarden(), is(equalTo(false)));
        assertThat(house.getHasPool(), is(equalTo(false)));
        assertThat(house.getHasStatues(), is(equalTo(false)));
    }

    @Test
    void testConstructHouseWithGarage_ShouldCreateHouseWithOnlyGarage() {
        houseDirector.constructHouseWithGarage(houseBuilder);
        House house = houseBuilder.build();

        assertThat(house.getHasGarage(), is(equalTo(true)));
        assertThat(house.getHasGarden(), is(equalTo(false)));
        assertThat(house.getHasPool(), is(equalTo(false)));
        assertThat(house.getHasStatues(), is(equalTo(false)));
    }
}
