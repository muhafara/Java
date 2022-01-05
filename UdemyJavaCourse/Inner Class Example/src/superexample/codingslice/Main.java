package superexample.codingslice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator c1 = new Calculator();
        Calculator.Results result = new Calculator.Results();
        System.out.println("Addition ; "+result.returnAdd(2,4));
        System.out.println("Subtraction ; "+result.returnSub(6,4));
        System.out.println("Multiplication ; "+result.returnMul(4,4));
        System.out.println("Division ; "+result.returnDiv(16,4));

    }
}
