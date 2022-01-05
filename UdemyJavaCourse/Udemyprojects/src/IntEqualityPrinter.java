public class IntEqualityPrinter {
    public static void printEqual(int numOne, int numTwo, int numThree){
        if (numOne < 0 || numTwo < 0 || numThree < 0){
            System.out.println("Invalid Value");
        }
        else if(numOne == numTwo && numTwo == numThree){
            System.out.println("All numbers are equal");
        }
        else if((numOne != numTwo && numOne == numThree) || (numOne == numTwo && numOne != numThree) ||
        (numTwo != numOne && numTwo == numThree) || (numTwo == numOne && numTwo != numThree) ||
                (numThree == numOne && numThree != numTwo) || (numThree == numTwo && numThree != numOne)
        ){
            System.out.println("Neither all are equal or different");
        }
        else {
            System.out.println("All numbers are different");
        }
    }
}
