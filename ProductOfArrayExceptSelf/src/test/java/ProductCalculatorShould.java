import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductCalculatorShould {
    @Test
    void calculate_product_of_integer_array_elements() {
        ProductCalculator productCalculator = new ProductCalculator();
        int[] nums = new int[]{1, 2, 3, 4};
        int[] output = productCalculator.productExceptSelf(nums);
        Assertions.assertThat(output).isEqualTo(new int[]{24, 12, 8, 6});

        nums = new int[]{-1, 1, 0, -3, 3};
        output = productCalculator.productExceptSelf(nums);
        Assertions.assertThat(output).isEqualTo(new int[]{0, 0, 9, 0, 0});
    }
}
