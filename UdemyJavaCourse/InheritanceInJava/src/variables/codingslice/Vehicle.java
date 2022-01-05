package variables.codingslice;

//Parent Class
public class Vehicle {
    private int carModelYear;
    private String carModelMaker;
    private String vehicleType;
    private int numOfDoor;
    private int numOfWheel;
    private int numOfSeat;

    //Constructor
    public Vehicle(int carModelYear, String carModelMaker, String vehicleType, int numOfDoor, int numOfWheel, int numOfSeat) {
        this.carModelYear = carModelYear;
        this.carModelMaker = carModelMaker;
        this.vehicleType = vehicleType;
        this.numOfDoor = numOfDoor;
        this.numOfWheel = numOfWheel;
        this.numOfSeat = numOfSeat;
    }

    //Getter for all the data types of a class
    public int getCarModelYear() {
        return carModelYear;
    }

    public String getCarModelMaker() {
        return carModelMaker;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getNumOfDoor() {
        return numOfDoor;
    }

    public int getNumOfWheel() {
        return numOfWheel;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }
}
