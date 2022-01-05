package superexample.codingslice;

public class Samsung implements ITelephone {
    private String mobilePhoneName;

    public Samsung(){
        this("Samsung");
    }
    public Samsung(String mobilePhoneName) {
        this.mobilePhoneName = mobilePhoneName;
        System.out.println("Your phone company name is "+mobilePhoneName);
    }

    @Override
    public void isPhoneOn(boolean powerOn) {
        if(powerOn){
            System.out.printf("Your android device is powered on");
        }else {
            System.out.println("You device is not powered on");
        }
    }

    @Override
    public void softWareVersion() {
        System.out.println("The version of software installed in your android device is Jelly beans");
    }

}
