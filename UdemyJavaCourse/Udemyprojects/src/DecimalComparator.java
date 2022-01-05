public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1757, -3.1756));
    }

    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
        boolean areNumberRerTheSameUpToThreeDecimal;
        double startValue = 0.0009;
        double endValue = -0.0009;
        areNumberRerTheSameUpToThreeDecimal =(x - y <= startValue || x - y >= -0.0009);
        return areNumberRerTheSameUpToThreeDecimal;
    }
}
