public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (barking) {
            int time = 24;

        } else if (hourOfDay > 8 || hourOfDay < 22) {
            return true;

        } else if (hourOfDay < 0 || hourOfDay > 23) {
            return false;

        }
        return false;
    }

    public static void main(String[] args) {
        //shouldWakeUp(true,1);
        System.out.println(shouldWakeUp(true   , 4));
    }
}
