import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanPlaceFlowersShould {

    @Test
    void say_if_is_possible_to_fit_n_flowers_in_the_plots_and_not_violate_adjacent_condition() {
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers(new int[]{1, 0, 0, 0, 1});
        Assertions.assertThat(canPlaceFlowers.isItPossibleToFitNFlowersInThePlotsAndNotViolateAdjacentCondition(1)).isTrue();

        canPlaceFlowers = new CanPlaceFlowers(new int[]{1, 0, 0, 0, 1});
        Assertions.assertThat(canPlaceFlowers.isItPossibleToFitNFlowersInThePlotsAndNotViolateAdjacentCondition(2)).isFalse();

        canPlaceFlowers = new CanPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1});
        Assertions.assertThat(canPlaceFlowers.isItPossibleToFitNFlowersInThePlotsAndNotViolateAdjacentCondition(2)).isFalse();

        canPlaceFlowers = new CanPlaceFlowers(new int[]{0, 0, 1, 0, 1});
        Assertions.assertThat(canPlaceFlowers.isItPossibleToFitNFlowersInThePlotsAndNotViolateAdjacentCondition(1)).isTrue();

        canPlaceFlowers = new CanPlaceFlowers(new int[]{1, 0, 1, 0, 0});
        Assertions.assertThat(canPlaceFlowers.isItPossibleToFitNFlowersInThePlotsAndNotViolateAdjacentCondition(1)).isTrue();

        canPlaceFlowers = new CanPlaceFlowers(new int[]{1});
        Assertions.assertThat(canPlaceFlowers.isItPossibleToFitNFlowersInThePlotsAndNotViolateAdjacentCondition(0)).isTrue();

        canPlaceFlowers = new CanPlaceFlowers(new int[]{0});
        Assertions.assertThat(canPlaceFlowers.isItPossibleToFitNFlowersInThePlotsAndNotViolateAdjacentCondition(1)).isTrue();

        canPlaceFlowers = new CanPlaceFlowers(new int[]{1, 0});
        Assertions.assertThat(canPlaceFlowers.isItPossibleToFitNFlowersInThePlotsAndNotViolateAdjacentCondition(0)).isTrue();

        canPlaceFlowers = new CanPlaceFlowers(new int[]{0, 0, 1, 0, 0});
        Assertions.assertThat(canPlaceFlowers.isItPossibleToFitNFlowersInThePlotsAndNotViolateAdjacentCondition(1)).isTrue();

        canPlaceFlowers = new CanPlaceFlowers(new int[]{0, 0});
        Assertions.assertThat(canPlaceFlowers.isItPossibleToFitNFlowersInThePlotsAndNotViolateAdjacentCondition(2)).isFalse();
    }
}

