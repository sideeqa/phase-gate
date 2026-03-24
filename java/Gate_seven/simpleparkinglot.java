//You are to simulate a simple parking lot
//with 20 slots.
//● Each slot is either empty (0) or occupied
//by a car number (1).
//● A car can enter the parking lot if there’s a
//free slot from left to right( from slot 1 - 20 )
//or by indicating a slot number that is still
//empty.
//● A car can leave a slot by specifying the
//slot number where it was parked.
//● You should be able to display the
//parking status after each action
//showing available spaces for te and
//filled up spaces.


//


import java.util.Scanner;

public class simpleparkinglot {

    static int[] slots = new int[20]; 

   
    public static void displaySlots() {
        System.out.println("\nParking Lot Status:");
        for (int count = 0; count < slots.length; count++) {
            System.out.println("Slot " + (count + 1) + ": " + (slots[count] == 0 ? "Empty" : "Occupied"));
        }
    }

    
    public static void parkAuto() {
        for (int count = 0; count < slots.length; count++) {
            if (slots[count] == 0) {
                slots[count] = 1;
                System.out.println("Car parked at slot " + ( + 1));
                return;
            }
        }
        System.out.println("Parking lot is full!");
    }

    
    public static void parkAtSlot(int slotNumber) {
        if (slotNumber < 1 || slotNumber > 20) {
            System.out.println("Invalid slot number!");
            return;
        }

        if (slots[slotNumber - 1] == 0) {
            slots[slotNumber - 1] = 1;
            System.out.println("Car parked at slot " + slotNumber);
        } else {
            System.out.println("Slot already occupied!");
        }
    }

    
    public static void leaveSlot(int slotNumber) {
        if (slotNumber < 1 || slotNumber > 20) {
            System.out.println("Invalid slot number!");
            return;
        }

        if (slots[slotNumber - 1] == 1) {
            slots[slotNumber - 1] = 0;
            System.out.println("Car left slot " + slotNumber);
        } else {
            System.out.println("Slot already empty!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Parking Lot Menu ---");
            System.out.println("1. Park Car (Auto)");
            System.out.println("2. Park Car (Choose Slot)");
            System.out.println("3. Remove Car");
            System.out.println("4. Display Parking");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    parkAuto();
                    displaySlots();
                    break;

                case 2:
                    System.out.print("Enter slot number (1-20): ");
                    int slot = scanner.nextInt();
                    parkAtSlot(slot);
                    displaySlots();
                    break;

                case 3:
                    System.out.print("Enter slot number to remove car: ");
                    int leave = scanner.nextInt();
                    leaveSlot(leave);
                    displaySlots();
                    break;

                case 4:
                    displaySlots();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}
