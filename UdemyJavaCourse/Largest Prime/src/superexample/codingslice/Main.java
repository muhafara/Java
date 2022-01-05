package superexample.codingslice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {

        if (number <= 0 || number <= 1) {
            return -1;
        }
        else {
            int largestPrime = 2;
            while (largestPrime < number) {
                if (number % largestPrime != 0) {
                    largestPrime++;
                } else {
                    number = number / largestPrime;

                }
            }
            return number;
        }
    }
}
