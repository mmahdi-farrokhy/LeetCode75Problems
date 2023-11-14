public class ProductCalculator {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int productOfAll = 1;
        int zeroCounter = 0;
        for (int num : nums) {
            if (num != 0)
                productOfAll *= num;
            else
                zeroCounter++;
        }

        if (zeroCounter > 1) {
            for (int numIndex = 0; numIndex < nums.length; numIndex++)
                output[numIndex] = 0;
        }
        if (zeroCounter == 1) {
            for (int numIndex = 0; numIndex < nums.length; numIndex++) {
                if (nums[numIndex] == 0)
                    output[numIndex] = productOfAll;
                else
                    output[numIndex] = 0;
            }
        } else if (zeroCounter == 0) {
            for (int numIndex = 0; numIndex < nums.length; numIndex++)
                output[numIndex] = productOfAll / nums[numIndex];
        }

        return output;
    }
}
