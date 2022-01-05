package variables.codingslice;

public class Main {

    public static void main(String[] args) {
        //Child class Automatic Vehicle
        AutomaticVehicle automaticvehicle = new AutomaticVehicle(2011, "Mercedes", "Hatchback",
                4, 4, 5, "Automatic Transmission");
        System.out.println("............Child Class............Automatic Transmission...................!");
        System.out.println("Vehicle Model Year :"+automaticvehicle.getCarModelYear()+"\nVehicle Model Maker "+automaticvehicle.getCarModelMaker()
        +"\nVehicle Types "+automaticvehicle.getVehicleType()+"\nNumber of Door "+automaticvehicle.getNumOfDoor()
        +"\nNumber of wheel "+automaticvehicle.getNumOfWheel()+"\nNumber of seats "+automaticvehicle.getNumOfSeat()
        +"\nCar transmission "+automaticvehicle.getCarTransmission());
        System.out.println(".....................................END...................................................");

        //Child class Manual Vehicle
        ManualVehicle manualvehicle = new ManualVehicle(2018, "BMW", "Saloon",
                2, 4, 5, "Manual Transmission");
        System.out.println("............Child Class............Manual Transmission...................!");
        System.out.println("Vehicle Model Year :"+manualvehicle.getCarModelYear()+"\nVehicle Model Maker "+manualvehicle.getCarModelMaker()
                +"\nVehicle Types "+manualvehicle.getVehicleType()+"\nNumber of Door "+manualvehicle.getNumOfDoor()
                +"\nNumber of wheel "+manualvehicle.getNumOfWheel()+"\nNumber of seats "+manualvehicle.getNumOfSeat()
                +"\nCar transmission "+manualvehicle.getCarTransmission());
        System.out.println(".....................................END...................................................");

    }
}
