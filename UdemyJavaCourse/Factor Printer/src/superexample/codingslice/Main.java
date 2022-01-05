package superexample.codingslice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printFactors(6);
    }
    public static void printFactors (int number) {
        int factor = 0;
        if(number < 1){
            System.out.println("Invalid Value");
        }else{
            for (int i = 1; i <= number; i++){
                if(number % i == 0){
                    factor = i;
                    System.out.println(factor);
                }
            }
        }
    }
}
