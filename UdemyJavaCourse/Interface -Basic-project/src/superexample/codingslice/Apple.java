package superexample.codingslice;

public class Apple implements ITelephone {
    private String mobilePhoneName;

    public Apple(){
        this("Apple");
    }
    public Apple(String mobilePhoneName) {
        this.mobilePhoneName = mobilePhoneName;
        System.out.println("Your phone company name is "+mobilePhoneName );
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
        System.out.println("The version of software installed in your Apple device is 15");
    }

}