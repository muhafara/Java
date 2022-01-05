package superexample.codingslice;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner(System.in);

    private static ArrayList <String> groceryList = new ArrayList<String>();
    public static void main(String[] args) {
        //Adding items in grocery ist using add();
        groceryList.add("Eggs");
        groceryList.add("Vegetable Oil");
        groceryList.add("Ghee");
        groceryList.add("Cumin seeds");
        groceryList.add("Potatoes");
        groceryList.add("Tomatoes");
        groceryList.add("Drinks");
        groceryList.add("Bottles");

        //Adding items into grocery list by taking user input
        addGroceryItems();
        addGroceryItems();
        addGroceryItems();

        System.out.println("\nNumber of items inside your grocery list");
        showOneGroceryItems();

        System.out.println("Getting list of grocery items");
        showAllGroceryitems();

        System.out.println("Modifying or adding grocery item at specific number");
        modifyGroceryList(2,"Pen");

        System.out.println("Updated grocery list");
        showAllGroceryitems();

        System.out.println("Removing a grocery item");
        deleteGroceryItem(2);

        System.out.println("Updated grocery list");
        showAllGroceryitems();

        //Searching an items in the grocery list

        findItem("Drinks");


    }
    //Add item in grocery list
    public static void addGroceryItems(){
        System.out.println("Please enter the grocery items you would like to add to yur list");
        groceryList.add(scanner.nextLine());
        }

    //Show number of items in grocery list
    public static void showOneGroceryItems(){
        System.out.println("You have "+ groceryList.size() + " items in your grocery list");
        }

    //Show all grocery items
    public static void showAllGroceryitems(){
        for(int i = 0 ; i < groceryList.size(); i++){
            System.out.println("The "+ (i+1)  +" items in your grocery list is "+groceryList.get(i));
        }
    }

    //Adding a grocery items in array list at specific index

    public static void modifyGroceryList(int index, String element){
        groceryList.set(index,element);
        System.out.println("You have add grocery item at index "+index+ " and the item is "+element);
    }

    //Deleting an item from the grocery list
    public static void deleteGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    //Searching for a specific item in the list

    public static void findItem(String searchItem){
        int getIndex = groceryList.indexOf(searchItem);
        if(getIndex >= 0){
            System.out.println("Your item found at the index of "+getIndex+" and the item is "+groceryList.get(getIndex));
        }else{
            System.out.println("Sorry your item doesn't exist in the grocery list....");
        }
    }
}
