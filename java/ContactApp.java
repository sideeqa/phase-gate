import java.util.Arrays;
import java.util.Scanner;


public class ContactApp{
    
    

    public Contact(String firstName, String lastName, String phoneNumber) {
        String phonemenu = " "
        1. Add Contact
        2. Remove contact
        3. Find Contact by PhoneNumber
        4. Find Contact by First Name
        5. Find Contact by Last Namegit
        == " "
      
    }

    public void displayContact(){
        System.out.println("Enter Phonemenu");
    }

    static Array[]contact= new Scanner(System.in);
        System.out.print("Enter the contactApp");
        String firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Enter PhoneNumber: ");
        String phone = input.nextLine();

        addContact(firstName, lastName, phoneNUmber);

        System.out.println("Contact Added Successfully!");

       
        
    

    public static void addContact(String firstName, String lastName, String phoneNumber) {
        Contact newContact = new Contact(firstName, lastName, phoneNumber);
        contacts.add(newContact);
    }

    public static void displayContacts() {
        System.out.println("\nAll Contacts:");
        for (Contact c : contacts) {
            contact c = displayContacts();
        }
    }

}


