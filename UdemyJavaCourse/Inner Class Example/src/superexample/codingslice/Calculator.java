package superexample.codingslice;

public class Calculator {

    private int myFirstNumber;
    private int mySecondNumber;


    public int getMyFirstNumber() {
        return myFirstNumber;
    }

    public int getMySecondNumber() {
        return mySecondNumber;
    }

    public static class Results{

        public double returnAdd(int n1, int n2){
            return n1+ n2;
        }

        public double returnSub(int n1, int n2){
            return n1 - n2;
        }

        public double returnMul(int n1, int n2){
            return n1 * n2;
        }

        public double returnDiv(int n1, int n2){
            return n1 / n2;
        }
    }
}
