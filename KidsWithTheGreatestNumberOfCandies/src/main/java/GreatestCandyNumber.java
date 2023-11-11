import java.util.Arrays;

public class GreatestCandyNumber {
    private int[] candies;
    private boolean[] boolArray;
    private int extraCandy;

    public GreatestCandyNumber(int[] candies, int extraCandy) {
        this.candies = candies;
        this.extraCandy = extraCandy;
        initBoolArray(candies);
    }

    private void initBoolArray(int[] candies) {
        boolArray = new boolean[candies.length];
        for (int candyIndex = 0; candyIndex < candies.length; candyIndex++) {
            boolArray[candyIndex] = false;
        }
    }

    public boolean[] getBoolArray() {
        for (int candyIndex = 0; candyIndex < candies.length; candyIndex++) {
            if (candies[candyIndex] + extraCandy >= Arrays.stream(candies).max().getAsInt()) {
                boolArray[candyIndex] = true;
            }
        }

        return boolArray;
    }
}
