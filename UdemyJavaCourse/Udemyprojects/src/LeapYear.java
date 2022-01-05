public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean isyearfine = false;
        if(year >= 1 && year <= 9999){
            if(year % 4 == 0){
                if(year % 100 != 0){
                    isyearfine = true;
                }else {
                    if(year % 400 == 0){
                        isyearfine = true;
                    }
                }
            }
            else isyearfine = false;
        }
        else{
            return isyearfine;
        }
        return isyearfine;
    }
}
