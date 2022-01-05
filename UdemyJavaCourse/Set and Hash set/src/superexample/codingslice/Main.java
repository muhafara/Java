package superexample.codingslice;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set <Integer> s =new HashSet<>();

        s.add(1);
        s.add(5);
        s.add(45);
        s.add(32);
        s.add(65);

        for (Integer i:s){
            System.out.printf("\nThe value of set is "+i);
        }

        //Tree set

        TreeSet<Integer> treeset = new TreeSet<>(s);
        System.out.println("Sorted List");
        System.out.println("The sorted "+treeset);



    }
}
