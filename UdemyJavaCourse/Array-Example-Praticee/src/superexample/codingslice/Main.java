package superexample.codingslice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How many Integers would you like to print!\r");
        int getArraylength = scanner.nextInt();
        System.out.println("Getting array Values\r");
        int myArrayValue [] = new int[getArraylength];
        getIntegers(myArrayValue);
        showValues(myArrayValue);
        System.out.println("The average values of all the integers are "+getArrayAverage(myArrayValue));

        System.out.println("Sorting arrays ascending");
        int [] sortedAscending = sortedArraysAscending(myArrayValue);
        showValues(sortedAscending);


        System.out.println("Sorting arrays descending");
        int [] sortedDecending = sortedArraysDescending(myArrayValue);
        showValues(sortedDecending);


    }

    //Method to get inputs from user and store values in arrays
    public static int [] getIntegers(int [] array){
        System.out.println("Please enter your integers into arrays one-by-one\r");
        for (int i =0; i <array.length; i++){
            array [i] = scanner.nextInt();
        }
        return array;
    }

    //Method to print array values

    public static int [] showValues(int [] array){
        for(int i = 0; i < array.length; i ++) {
            System.out.println("The value at index "+i + " is " +array[i]);
        }
        return array;
    }

    //Method to get Average of an array

    public static double getArrayAverage(int [] array){
        int sum = 0;
        for(int i = 0 ; i < array.length; i++){
            sum +=  i;
        }
        return (double) sum / (double)   array.length;
    }

    //sorting array in Ascending order

    public static int [] sortedArraysAscending(int [] array){
        int [] sortedArrays =  new int[array.length];
        for (int i = 0 ; i < array.length; i++){
            sortedArrays[i] = array[i];
        }
        int temp;

        for (int i = 0; i <sortedArrays.length;  i++){
            for (int j = 0 ; j < sortedArrays.length-1; j++  ){
                if(sortedArrays[j] > sortedArrays[j+1]){
                    temp = sortedArrays[j];
                    sortedArrays[j] = sortedArrays[j+1];
                    sortedArrays[j+1] = temp;
                }
            }
        }
        return sortedArrays;
    }

    //Sorting array in descending order

    public static int [] sortedArraysDescending(int [] array){
/*        int [] sortedArrays =  new int[array.length];
        for (int i = 0 ; i < array.length; i++){
            sortedArrays[i] = array[i];
        }*/

        int [] sortedArrays = Arrays.copyOf(array,array.length);
        int temp;

        for (int i = 0; i <sortedArrays.length;  i++){
            for (int j = 0 ; j < sortedArrays.length-1; j++  ){
                if(sortedArrays[j] < sortedArrays[j+1]){
                    temp = sortedArrays[j];
                    sortedArrays[j] = sortedArrays[j+1];
                    sortedArrays[j+i] = temp;
                }
            }
        }
        return sortedArrays;
    }
}
