package superexample.codingslice;

public class Main {

    public static void main(String[] args) {
        // write your code here
        sumFirstAndLastDigit(5);
    }
    public static int sumFirstAndLastDigit(int number) {

        int lastDigit = 0;
        if(number >= 0){
            lastDigit = number % 10;

            while (number > 9){
                number = number / 10;
            }

            System.out.println("First Number " + number + " Last Number " + lastDigit + " Total = " + (number + lastDigit));
            return number + lastDigit;
        } else

            System.out.println("-1");
        return -1;
    }
}
