package superexample.codingslice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDaysInMonth(12,10000));
    }

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


    public static int getDaysInMonth (int month, int year) {
        int getValueReturn =0;
        if((month < 1 || month > 12) || (year < 1 || year > 9999)) {

            return -1;
        }

        if (month == 1) {
            getValueReturn = 31;
        } else if (month == 2) {
            if (isLeapYear(year)) {
                getValueReturn =  29;
            } else {
                getValueReturn = 28;
            }

        } else if (month == 3) {
            getValueReturn = 31;
        } else if (month == 4) {
            getValueReturn = 30;
        } else if (month == 5) {
            getValueReturn = 31;
        } else if (month == 6) {
            getValueReturn = 30;
        } else if (month == 7) {
            getValueReturn = 31;
        } else if (month == 8) {
            getValueReturn = 31;
        } else if (month == 9) {
            getValueReturn = 30;
        } else if (month == 10) {
            getValueReturn = 31;
        } else if (month == 11) {
            getValueReturn = 30;
        } else if (month == 12) {
            getValueReturn =  31;
        }
        return getValueReturn;
    }
}
