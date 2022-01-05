package superexample.codingslice;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        // Reference type vs valued type using integer

        int myFirstValue = 10;
        int mySecondvalue = myFirstValue;

        System.out.println("My First value "+myFirstValue);
        System.out.println("My Second value "+mySecondvalue);

        mySecondvalue++;
        System.out.println("After My First value "+myFirstValue);
        System.out.println("After My Second value "+mySecondvalue);


        //String (Reference type vs value types)

        String myFirstString = "Test";
        String mySecondString = myFirstString;
        System.out.println("String First value "+myFirstString);
        System.out.println("String Second value "+mySecondString);

        myFirstString = "Test 2";
        System.out.println("String First value "+myFirstString);
        System.out.println("String Second value "+mySecondString);


        //Arrays and classes its different
        //They don't work like data types it wont work independlty

        int [] myFirstArrays = new int[5];
        int [] mySecondArrays = myFirstArrays;

        System.out.println("My First Arrays values are ;"+ Arrays.toString(myFirstArrays));
        System.out.println("My Second Arrays values are ;"+ Arrays.toString(mySecondArrays));

        mySecondArrays [0] = 1;

        System.out.println("My First Arrays values are ;"+ Arrays.toString(myFirstArrays));
        System.out.println("My Second Arrays values are ;"+ Arrays.toString(mySecondArrays));
    }
}
