package superexample.codingslice;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getGreatestCommonDivisor(10, 35));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int greatest = 0;
        if(first < 10 || second < 10){
            return -1;
        }else if(first > 10 || second > 10) {
            for (int i = 1; ((i <= first) && (i <= second)); i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    greatest = i;
                }
            }
            return greatest;
        }
        return 0;
    }
}
