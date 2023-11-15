import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IncreasingTripletSubsequenceShould {
    private IncreasingTripletSubsequence increasingTripletSubsequence;

    @BeforeEach
    void setUp() {
        increasingTripletSubsequence = new IncreasingTripletSubsequence();
    }

    @Test
    void indicate_if_there_is_3_increasing_elements_in_a_row1() {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        Assertions.assertThat(increasingTripletSubsequence.increasingTriplet(nums)).isTrue();
    }

    @Test
    void indicate_if_there_is_3_increasing_elements_in_a_row2() {
        int[] nums = new int[]{5, 4, 3, 2, 1};
        Assertions.assertThat(increasingTripletSubsequence.increasingTriplet(nums)).isFalse();
    }

    @Test
    void indicate_if_there_is_3_increasing_elements_in_a_row3() {
        int[] nums = new int[]{2, 1, 5, 0, 4, 6};
        Assertions.assertThat(increasingTripletSubsequence.increasingTriplet(nums)).isTrue();
    }

    @Test
    void indicate_if_there_is_3_increasing_elements_in_a_row4() {
        int[] nums = new int[]{20, 100, 10, 12, 5, 13};
        Assertions.assertThat(increasingTripletSubsequence.increasingTriplet(nums)).isTrue();
    }
}
