package superexample.codingslice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] myArray = getInteger(5);
        printArray(myArray);
        System.out.println("Sorting arrays");
        int [] ArraySort = sortIntegers(myArray);
        printArray(ArraySort);
    }

    public static int [] getInteger(int sizeArray){
        int [] getArrayInteger = new int [sizeArray];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the array Integer");
        for(int i=0; i <getArrayInteger.length; i++){
            getArrayInteger[i] = scanner.nextInt();
        }
        scanner.close();
        return getArrayInteger;
    }

    public static void printArray(int [] array){
        int [] printMyArray = Arrays.copyOf(array,array.length);
        for(int i= 0; i < printMyArray.length; i++){
            System.out.println("Element "+ i +" contents "+printMyArray[i]);
        }
    }

    public static int [] sortIntegers(int [] array){
        System.out.println("Method calls");
        int [] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for (int i = 0; i <sortedArray.length-1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
