package dev.jenny.house.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import dev.jenny.house.models.House;

public class HouseBuilderTest {

    private HouseBuilder houseBuilder;

    @BeforeEach
    void setUp() {
        houseBuilder = new HouseBuilder();
    }

    @ParameterizedTest(name = "garage={0}, garden={1}, pool={2}, statues={3}")
    @MethodSource("houseAttributeCombinations")
    void testBuild_VariousAttributeCombinations_ShouldCreateMatchingHouseInstance(Boolean hasGarage, Boolean hasGarden,
            Boolean hasPool, Boolean hasStatues) {
        House house = houseBuilder
                .hasGarage(hasGarage)
                .hasGarden(hasGarden)
                .hasPool(hasPool)
                .hasStatues(hasStatues)
                .build();

        assertThat(house.getHasGarage(), is(equalTo(hasGarage)));
        assertThat(house.getHasGarden(), is(equalTo(hasGarden)));
        assertThat(house.getHasPool(), is(equalTo(hasPool)));
        assertThat(house.getHasStatues(), is(equalTo(hasStatues)));
    }

    private static Stream<Arguments> houseAttributeCombinations() {
        return Stream.of(
                Arguments.of(true, true, true, true),
                Arguments.of(false, false, false, false),
                Arguments.of(true, false, true, false),
                Arguments.of(false, true, false, true));
    }

}
