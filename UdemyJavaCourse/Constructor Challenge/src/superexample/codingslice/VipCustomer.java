package superexample.codingslice;
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Default name", 5000.00, "defaultcustomer@email.com");
        System.out.println("Constructor with default value");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "unknow@mail.com");
        System.out.println("Constructor with one default value");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this. emailAddress = emailAddress;
        System.out.println("Constructor with 3 argument constructor");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
