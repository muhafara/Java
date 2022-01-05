package superexample.codingslice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPerfectNumber(5));
    }
    public static boolean isPerfectNumber (int number) {
        int count = 0;
        boolean getResult = true;
        if(number < 1){
            getResult = false;
        }else if(number > 0){
            for (int i = 1; i < number; i++){
                if(number % i == 0){
                    count += i;
                    System.out.println("This is count" +count);
                }
            }
            if(count == number){
                getResult = true;
            }else{
                getResult = false;
            }
        }
        return getResult;
    }
}
