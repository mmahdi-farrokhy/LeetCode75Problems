import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreatestCandyNumberShould {
    @Test
    void init_a_bool_list_indicating_the_greatest_candies() {
        GreatestCandyNumber greatestCandyNumber = new GreatestCandyNumber(new int[]{2, 3, 5, 1, 3}, 3);
        boolean[] actualArray = greatestCandyNumber.getBoolArray();
        boolean[] expectedArray = new boolean[]{true, true, true, false, true};
        Assertions.assertThat(actualArray).isEqualTo(expectedArray).containsExactly(expectedArray);

        greatestCandyNumber = new GreatestCandyNumber(new int[]{4, 2, 1, 1, 2}, 1);
        actualArray = greatestCandyNumber.getBoolArray();
        expectedArray = new boolean[]{true, false, false, false, false};
        Assertions.assertThat(actualArray).isEqualTo(expectedArray).containsExactly(expectedArray);

        greatestCandyNumber = new GreatestCandyNumber(new int[]{12, 1, 12}, 10);
        actualArray = greatestCandyNumber.getBoolArray();
        expectedArray = new boolean[]{true, false, true};
        Assertions.assertThat(actualArray).isEqualTo(expectedArray).containsExactly(expectedArray);
    }
}
