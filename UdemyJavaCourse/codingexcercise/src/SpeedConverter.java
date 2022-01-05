public class SpeedConverter {
    public static long toMilesPerHour(long kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round( kilometersPerHour * 1.609);
    }

    public static void printConversion(long kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHours = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h= " + milesPerHours + " mi/h");
        }
    }

}
