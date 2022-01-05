package superexample.codingslice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int [] arrayMinimum = readElement(readInteger());
        System.out.println(Arrays.toString(arrayMinimum));
        System.out.println("The minimum value in the array is : "+findMin(arrayMinimum));
    }
    public static int readInteger(){
        int numberOfElement = 0;
        System.out.println("How many Elements you would to enter");
        numberOfElement = scanner.nextInt();
        return numberOfElement;
    }

    public static int [] readElement(int count){
        int [] readArray = new int[count];
        System.out.println("Please Enter the element of arrays one-by-one");
        for(int i = 0; i < readArray.length; i++){
            readArray [i] = scanner.nextInt();
        }
        return readArray;
    }

    public static int findMin(int [] array){
        int min = Integer.MAX_VALUE;
        int value;
        for(int i = 0; i < array.length; i++){
            value = array[i];
            if(value < min ){
                min = value;
            }
        }
        return min;
    }

}
