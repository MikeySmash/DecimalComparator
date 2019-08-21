public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double firstValue, double secondValue){
        boolean equalByThreeDecimalPlaces = false;

        int roundedFirstValue = (int) (firstValue * 1000);
        int roundedSecondValue = (int) (secondValue * 1000);

        if (roundedFirstValue == roundedSecondValue){
            equalByThreeDecimalPlaces = true;
        }
        return equalByThreeDecimalPlaces;
    }
}
