public class BarkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false, 6));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking) {
            barking = false;
        } else {
            if (hourOfDay >= 0 && hourOfDay <= 23) {
                if (barking && hourOfDay == 8 || hourOfDay == 22) {
                    barking = false;
                } else if (barking && (hourOfDay > 22) && (hourOfDay < 24) || (hourOfDay >= 0) && (hourOfDay < 8))
                {
                    barking = true;
                }
            } else {
                barking = false;
            }
        }
        return barking;
    }
}