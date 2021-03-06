package superexample.codingslice;

public class Contact {

    private String contactName;
    private String contactNumber;

    public Contact(String contactName, String contactNumber) {
        this.contactName = contactName;
        this.contactNumber = contactNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public Contact createContact(String contactName, String contactNumber) {
        return new Contact(contactName, contactNumber);
    }

}
