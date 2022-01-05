package superexample.codingslice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(231, 372, 423));
        System.out.println(hasSameLastDigit(91, 991, 532));
        System.out.println("Is in range "+isValid(10));
        System.out.println("Is in range "+isValid(468));
        System.out.println("Is in range "+isValid(1051));

    }
    public static boolean hasSameLastDigit (int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber >= 10 && firstNumber <= 1000) && (secondNumber >= 10 && secondNumber <= 1000) && (thirdNumber >= 10 && thirdNumber <= 1000)) {
            System.out.println("Do any of given numbers (" + firstNumber + ", " + secondNumber + ", " + thirdNumber + ") share a last digit?");
            return ((firstNumber % 10 == secondNumber % 10) || (firstNumber % 10 == thirdNumber % 10) || (secondNumber % 10 == thirdNumber % 10));
        }
        System.out.println("Invalid input");
        return false;
    }

    public static boolean isValid(int num){
        boolean isInRange = false;
        if(num >= 10 && num <= 1000){
            isInRange = true;
        }else {
            isInRange = false;
        }
        return  isInRange;
    }

}
