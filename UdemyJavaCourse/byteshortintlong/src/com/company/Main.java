package com.company;

public class Main {

    public static void main(String[] args) {
        int intMinValue = Integer.MIN_VALUE;
        int intmaxValue = Integer.MAX_VALUE;
        System.out.println( "Minimum value of Integer " + intMinValue);
        System.out.println( "Maximum value of Integer " + intmaxValue);

        byte myByteValue =  125;
        short myShortValue = 32500;
        long myLongvalue = 50000L + 10L * (myByteValue + myShortValue);
        System.out.println(" The total result is " + myLongvalue);

        float myFloatNumber = 3.0f;
        System.out.println(myFloatNumber);
    }
}
