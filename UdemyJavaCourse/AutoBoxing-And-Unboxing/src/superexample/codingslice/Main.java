package superexample.codingslice;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //No allowed because int is a primitive type
        //ArrayList <int> myIntegers = new ArrayList<int>();
        //Array lists needs a class
        /*We can make a new class of integer inorder to accept it for Array list
        or
        we can use a concept of auto boxing and unboxing by using a wrapper class
        * */
        ArrayList <Integer> myIntegerList = new ArrayList<Integer>();

        //Adding integers into array list
        //----> Autoboxing
        for(int i = 0 ; i <= 10; i++){
            myIntegerList.add(Integer.valueOf(i*20));
        }

        //to print all the entry from integer array list
        //--> unboxing
        for(int i = 0; i <= 10; i++){
            System.out.println("The index is "+i+ " integer list is "+myIntegerList.get(i)); //.intValue()) will be added at compiletime;
        }

    }
}
