import java.util.Arraylist;
import java.util.Scanner;


public class ContactApp{
    
    

    public Contact(String firstName, String lastName, String phoneNumber) {
        String phonemenu = """
        1. Add Contact
        2. Remove contact
        3. Find Contact by PhoneNumber
        4. Find Contact by First Name
        5. Find Contact by Last Namegit
        6. Edit contact
        7. Exit App
        """;
      
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

        String contact = firstName + " " + lastName + " - " + phone;
        
         contacts.add(contact);

        System.out.println("Contact Added Successfully!");
    }


        public static void removeContact() {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter phone number to delete: ");
    String phone = input.nextLine();

    boolean found = false;

    for (int count = 0; count < contacts.size(); count++) {
        if (contacts.get(count).contains(phone)) {
            contacts.remove(count);
            found = true;
            System.out.println("Contact removed successful");
            break;
        }
    }

    if (!found) {
        System.out.println("Contact not found");
    }
}

        
    

   

