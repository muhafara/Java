package thismethod.codingslice;

import java.lang.reflect.Constructor;

public class thisExample {
    //Instance of a class
    private int myNumber;
    private String myName;

    //////////////////////////Example two///////////////////////////////
     /*
    Example Two
    Constructor with the two arguments with the different name as instance of the class
    We shall create a two argument constructor
    with different name as instance of a class
    Link them by using this key word in constructor
    Note : It is not necessary that constructor arguments and instance of a class has a same name.
    */

    public thisExample(int mySecondNumber, String mySecondName) {
        //Constructor parameter has the same name as instance of a class
        this.myNumber = mySecondNumber;
        this.myName = mySecondName;
    }
}
