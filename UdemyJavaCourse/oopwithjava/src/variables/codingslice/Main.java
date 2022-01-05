package variables.codingslice;

public class Main {

    public static void main(String[] args) {
        System.out.println("Two argument constructor");
        BankAccount firstCustomerBankAccount = new BankAccount(1234, "First Customer");
        System.out.println("First Customer ID number is " + firstCustomerBankAccount.getCustomerIdNumber() + "\nFirst customer name is " + firstCustomerBankAccount.getCustomerName());
        System.out.println("Four argument constructor");
        BankAccount secondCustomerBankAccount = new BankAccount(1235, "Second Customer", "America", "email@customer.com");
        System.out.println("First Customer ID number is " + secondCustomerBankAccount.getCustomerIdNumber() + "\nFirst customer name is " + secondCustomerBankAccount.getCustomerName() +
                "\nCustomer Address is " + secondCustomerBankAccount.getCustomerAddress() + "\nCustomer Email is " + secondCustomerBankAccount.getCustomerEmail());
    }
}
