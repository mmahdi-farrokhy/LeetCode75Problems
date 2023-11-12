public class CanPlaceFlowers {
    private int[] flowerbed;

    public CanPlaceFlowers(int[] flowerBed) {
        this.flowerbed = flowerBed;
    }

    public boolean isItPossibleToFitNFlowersInThePlotsAndNotViolateAdjacentCondition(int n) {
        int possiblePlotsCount = 0;
        if (flowerbed.length > 1) {
            try {
                for (int plotIndex = 0; plotIndex < flowerbed.length; plotIndex++) {
                    if (plotIndex == 0 && flowerbed[plotIndex + 1] == 0) {
                        if (flowerbed[plotIndex] == 0) {
                            possiblePlotsCount++;
                            flowerbed[plotIndex] = 1;
                        }
                    } else if (plotIndex == flowerbed.length - 1 && flowerbed[plotIndex - 1] == 0) {
                        if (flowerbed[plotIndex] == 0) {
                            possiblePlotsCount++;
                            flowerbed[plotIndex] = 1;
                        }
                    } else {
                        if (flowerbed[plotIndex] == 0) {
                            if (plotIndex < flowerbed.length && flowerbed[plotIndex + 1] == 0) {
                                if (plotIndex > 0 && flowerbed[plotIndex - 1] == 0) {
                                    possiblePlotsCount++;
                                    flowerbed[plotIndex] = 1;
                                }
                            }
                        }
                    }
                }
            } catch (IndexOutOfBoundsException exception) {
            }
        } else {
            if (flowerbed.length == 1)
                if (flowerbed[0] == 0)
                    possiblePlotsCount++;
        }

        return possiblePlotsCount >= n;
    }
}
