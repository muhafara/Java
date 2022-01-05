package superexample.codingslice;

public class ChildClass extends ParentClass{
    //Creating an object of parent class
    ParentClass parentClass;
    //Accessing numOne from Parent Class
    private int numTwo = parentClass.numOne + 4;

    public ChildClass(String name) {
    }
}
