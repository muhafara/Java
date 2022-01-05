package superexample.codingslice;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList <String> placesToVisit = new LinkedList<String>();

        placesToVisit.add("London");
        placesToVisit.add("Manchester");
        placesToVisit.add("Purfleet");
        placesToVisit.add("Nottingham");
        placesToVisit.add("South-end-on-sea");
        placesToVisit.add("Rayleigh");
        placesToVisit.add("Basildon");
        placesToVisit.add("Stanford lee hope");

        printLinkedList(placesToVisit);

        placesToVisit.add(1,"Green Street");
        printLinkedList(placesToVisit);
    }

    public static void printLinkedList(LinkedList <String> list){
        Iterator<String> i = list.iterator();
        while (i.hasNext()){
            System.out.println("Now Visiting "+i.next());
        }
        System.out.println("==============================================");
    }
}
