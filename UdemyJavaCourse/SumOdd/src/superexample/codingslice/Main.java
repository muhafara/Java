package superexample.codingslice;

public class Main {

    public static void main(String[] args) {
        // write your code here
        sumOdd(100,1000);
        System.out.println("The number is odd "+isOdd(27));

    }

    public static boolean isOdd(int number) {
        boolean isNumbOdd = false;
        if (number > 0) {
            if(number % 2 != 0){
                isNumbOdd = true;
            }
        }else {
            isNumbOdd = false;
        }
        return isNumbOdd;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if((end >= start) && (end > 0 && start > 0)){
        for(int i = start; i <= end; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }//for end
        }//if end
        else{
            sum = -1;
        }
        System.out.println(sum);
        return sum;
    }


}
