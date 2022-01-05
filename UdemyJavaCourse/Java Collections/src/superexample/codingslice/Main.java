package superexample.codingslice;

import java.util.*;
import java.util.Map;

public class Main {

    public static Map<Integer, String> myMap = new IdentityHashMap<>();
    public static void main(String[] args) {
        myMap.put(1, "Java Object oriented languages");
        myMap.put(2, ".net Frame work used to create a microsoft application");
        myMap.put(3, "C is the basic Programming language for beginners");

        myMap.remove(3);
        System.out.println("==================================");
        for (Integer key : myMap.keySet()){
            System.out.println(key + " : "  + myMap.get(key));
        }
    }
}
