package superexample.codingslice;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0030 330 4404");
    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\n Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\n ");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();;
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateConatct();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    querycontact();
                    break;
                case 6:
                    printActions();
                    break;

            }

        }
    }

    private static void updateConatct(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found. ");
            return;
        }
        System.out.println("Enter new Contact name;");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNUmber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newName);
        if(mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("Successfully updated record");
        }else{
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found. ");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting contact");
        }
    }

    private static void querycontact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found. ");
            return;
        }
        System.out.println("Name: "+existingContactRecord.getName() + "phone number is "+existingContactRecord.getPhoneNumber());
    }

    private static void addNewContact(){
        System.out.println("Enter new Contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = "+ name + ", phone = "+ phone);
        }else{
            System.out.println("Cannot add, "+ name + "already on file");
        }
    }


    private static  void startPhone(){
        System.out.println("Starting phone....");
    }

    private static void printActions(){
        System.out.println("\nAvaliable actions:\npress");
        System.out.println("0  -  to shutdown\n"+
                            "1  - t0 print contacts\n"+
                            "2  - t0 add a  new contacts\n"+
                            "3  - t0 update an existing contact\n"+
                            "4  - t0 remove an existing contacts\n"+
                            "5  - query if an existing contact exists\n"+
                            "6  - t0 print a list of aaliable actions.\n");
        System.out.println("Choose your action: ");
    }
}
