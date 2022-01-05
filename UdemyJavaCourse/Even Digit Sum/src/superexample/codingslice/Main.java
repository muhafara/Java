package superexample.codingslice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getEvenDigitSum(123456789));

    }
    public static int getEvenDigitSum(int number){

        int total = 0;

        if(number > 0) {

            while (number != 0){
                int even = number % 10;

                if (even % 2 == 0) {
                    total += even;
                }

                number /= 10;
            }

        }else if(number < 0){
            return -1;
        }
        return total;
    }
}
