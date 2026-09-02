package dev.jenny.house.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.jenny.house.models.House;

public class HouseBuilderTest {

    private HouseBuilder houseBuilder;

    @BeforeEach
    void setUp() {
        houseBuilder = new HouseBuilder();
    }

    @Test
    void testBuild_AllAttributesSet_ShouldCreateHouseInstance() {
        House house = houseBuilder
                .hasGarage(true)
                .hasGarden(false)
                .hasPool(true)
                .hasStatues(false)
                .build();

        assertThat(house.getHasGarage(), is(equalTo(true)));
        assertThat(house.getHasGarden(), is(equalTo(false)));
        assertThat(house.getHasPool(), is(equalTo(true)));
        assertThat(house.getHasStatues(), is(equalTo(false)));
    }

}
