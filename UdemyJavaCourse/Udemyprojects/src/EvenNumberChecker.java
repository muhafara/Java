public class EvenNumberChecker {

    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        while (number <= 20){
            number ++;
            if (!isNumberEven(number)){
                continue;
            }
            count ++;
            System.out.println("Even Number are : "+number);
        }
        System.out.println("The total Even numbers found are : "+count);
    }


    private static boolean isNumberEven(int number){
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }


}
