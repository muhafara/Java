package superexample.codingslice;

public class Main {

    Samsung s;

    public static void main(String[] args) {
	// write your code here
        System.out.println("For Samsung");
        ITelephone myPhone = new Samsung();
        myPhone.isPhoneOn(false);
        myPhone.softWareVersion();
        checkTouchScreenStatus(true);

        System.out.println("For Apple");
        myPhone = new Apple();
        myPhone.isPhoneOn(true);
        myPhone.softWareVersion();
        checkTouchScreenStatus(true);
    }

    public static void checkTouchScreenStatus(boolean getStatus){
        if(getStatus){
            System.out.println("Your device supports touch features");
        }else {
            System.out.println("Sorry ! . Your device doesn't support touch feautres");
        }
    }
}
