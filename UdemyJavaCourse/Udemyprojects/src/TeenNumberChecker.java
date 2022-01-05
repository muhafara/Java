public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(3,5,25));
        System.out.println(isTeen(27));
    }

    public static boolean hasTeen(int teenNumOne, int teenNumTwo, int teenNumThree){
        boolean isThereIsAnyTeen;
        int earlyTeenChecker = 13;
        int afterTeenChecker = 19;
        isThereIsAnyTeen = (teenNumOne >= earlyTeenChecker && teenNumOne <= afterTeenChecker) ||
                (teenNumTwo >= earlyTeenChecker && teenNumTwo <= afterTeenChecker)
                || (teenNumThree >= earlyTeenChecker && teenNumThree <= afterTeenChecker);
        return isThereIsAnyTeen;
    }

    public static boolean isTeen(int teenNum){
        boolean isThereIsAnyTeen;
        int earlyTeenChecker = 13;
        int afterTeenChecker = 19;
        isThereIsAnyTeen = (teenNum >= earlyTeenChecker && teenNum <= afterTeenChecker);
        return isThereIsAnyTeen;
    }
}
