public class EqualSumChecker {

    public static boolean hasEqualSum(int numOne, int numTwo, int numSum){
        boolean isSumOfTwoNumberEqualToThird = false;
        if(numOne + numTwo == numSum){
            isSumOfTwoNumberEqualToThird = true;
        }else
        {
            isSumOfTwoNumberEqualToThird = false;
        }
        return isSumOfTwoNumberEqualToThird;
    }
}
