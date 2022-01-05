package superexample.codingslice;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    //Ist constructor
    public Rectangle() {
        //this will second constructor
        this(0, 0);
    }

    //Second constructor
    public Rectangle(int width, int height) {
        //this will 3 constructor
        this(0, 0, width, height);
    }

    //third constructor
    public Rectangle(int x, int y, int width, int height) {
        //initialize all the variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
