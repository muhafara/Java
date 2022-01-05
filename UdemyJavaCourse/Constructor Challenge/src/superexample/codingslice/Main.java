package superexample.codingslice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VipCustomer vipCustomer=new VipCustomer();
        System.out.println("Default name "+ vipCustomer.getName()
        +"\nDefault credit score "+ vipCustomer.getCreditLimit()
                +"\nDefault email address "+vipCustomer.getEmailAddress());

        VipCustomer vipCustomerTwo  = new VipCustomer("ABC",200.00);
        System.out.println( "name "+ vipCustomerTwo.getName()
                +"\nDefault credit score "+ vipCustomerTwo.getCreditLimit()
                +"\nDefault email address "+vipCustomerTwo.getEmailAddress());
    }


}
