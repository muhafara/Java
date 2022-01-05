package superexample.codingslice;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Contact getContact = new Contact("Tim","0123-456-789");
        System.out.printf("Name "+getContact.getContactName()+"\nContact Number: "+getContact.getContactNumber());
        System.out.printf("The Object "+getContact.getContactDetails("Name of object", "Contact number of object"));
    }
}
