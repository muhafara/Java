package variables.codingslice;

public class BankAccount {

    private int customerIdNumber;
    private String customerName;
    private String customerAddress;
    private String customerEmail;

    //Constructor with two arguments
    public BankAccount(int customerIdNumber, String customerName) {
        this.customerIdNumber = customerIdNumber;
        this.customerName = customerName;
    }
    //Constructor with four arguments
    public BankAccount(int customerIdNumber, String customerName, String customerAddress, String customerEmail) {
        this.customerIdNumber = customerIdNumber;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
    }

    //Getter so we can get the value of data types
    public int getCustomerIdNumber() {
        return customerIdNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
