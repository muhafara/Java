package variables.codingslice;

 class ManualVehicle extends Vehicle{
    private String carTransmission;
    //Constructor

    public ManualVehicle(int carModelYear, String carModelMaker, String vehicleType, int numOfDoor, int numOfWheel, int numOfSeat, String carTransmission) {
        super(carModelYear, carModelMaker, vehicleType, numOfDoor, numOfWheel, numOfSeat);
        this.carTransmission = carTransmission;
    }

    //Getter for datatype
    public String getCarTransmission() {
        return carTransmission;
    }
}
