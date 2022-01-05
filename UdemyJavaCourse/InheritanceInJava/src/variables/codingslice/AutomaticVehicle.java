package variables.codingslice;

public class AutomaticVehicle extends Vehicle {
    private String CarTransmission;

    //Constructor

    public AutomaticVehicle(int carModelYear, String carModelMaker, String vehicleType, int numOfDoor, int numOfWheel, int numOfSeat, String carTransmission) {
        super(carModelYear, carModelMaker, vehicleType, numOfDoor, numOfWheel, numOfSeat);
        this.CarTransmission = carTransmission;
    }

    //Getter

    public String getCarTransmission() {
        return CarTransmission;
    }
}
