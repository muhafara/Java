package superexample.codingslice;

import java.util.ArrayList;


public class Customer {
    private String customerName;
    private ArrayList <Double> transactionDetails;
    public Customer(String customerName) {
        this.customerName = customerName;
        this.transactionDetails = new ArrayList <Double>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransaction() {
        return transactionDetails;
    }

    public void addTransaction(double transaction){
        transactionDetails.add(transaction);
    }

    public ArrayList<Double> showAllCustomerTransactions(){
        for(int i=0 ; i <transactionDetails.size(); i++ ){
            System.out.println("The transaction no : " +i+ " is "+transactionDetails.get(i));
        }
        return transactionDetails;
    }
}
