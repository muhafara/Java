package superexample.codingslice;

public class Main {

    public static void main(String[] args) {
        Customer c1= new Customer("John");
        c1.addTransaction(43.00);
        c1.addTransaction(32.89);
        c1.addTransaction(36.94);
        c1.addTransaction(12.34);
        c1.addTransaction(98.89);

        System.out.println("Transactions details of Customer \n:"+c1.getCustomerName() +
                "\n" +c1.showAllCustomerTransactions());

    }


}
