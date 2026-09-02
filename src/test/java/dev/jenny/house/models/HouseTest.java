package dev.jenny.house.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HouseTest {

    private House house;

    @BeforeEach
    void setUp() {
        house = new House(true, false, true, false);
    }

    @Test
    void testConstructor_ValidValues_ShouldInitializeFields() {
        assertThat(house.getHasGarage(), is(equalTo(true)));
        assertThat(house.getHasGarden(), is(equalTo(false)));
        assertThat(house.getHasPool(), is(equalTo(true)));
        assertThat(house.getHasStatues(), is(equalTo(false)));
    }

}
