mport org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class GuessingnumberAppTest{

    @Test
    public void testForTheRandomNumber(){

    int actual = GuessingnumberApp.getRandomNumber();

    int expected = 36;

    assertEquals(expected , actual);


}
































//    @Test
//    public void testParkAtSpecificSlot() {
//        simpleparkinglot.parkAtSlot(5);
//        assertEquals(1, simpleparkinglot.slots[4]);
//    }
//
//    @Test
//    public void testParkAtOccupiedSlot() {
//        simpleparkinglot.parkAtSlot(3);
//        simpleparkinglot.parkAtSlot(3);
//        assertEquals(1, simpleparkinglot.slots[2]); // still occupied
//    }
//
//    @Test
//    public void testLeaveSlot() {
//        simpleparkinglot.parkAtSlot(2);
//        simpleparkinglot.leaveSlot(2);
//        assertEquals(0, simpleparkinglot.slots[1]);
//    }
//
//    @Test
//    public void testLeaveEmptySlot() {
//        simpleparkinglot.leaveSlot(4);
//        assertEquals(0, simpleparkinglot.slots[3]);
//    }
//
//    @Test
//    public void testInvalidSlotNumberPark() {
//        simpleparkinglot.parkAtSlot(25);
//        // Ensure nothing changed
//        for (int slot : simpleparkinglot.slots) {
//            assertEquals(0, slot);
//        }
//    }
//
//    @Test
//    public void testInvalidSlotNumberLeave() {
//        simpleparkinglot.leaveSlot(0);
//        // Ensure nothing changed
//        for (int slot : simpleparkinglot.slots) {
//            assertEquals(0, slot);
//        }
//    }
//
//    @Test
//    public void testParkingLotFull() {
//        // Fill all slots
//        for (int i = 1; i <= 20; i++) {
//            simpleparkinglot.parkAtSlot(i);
//        }
//
//        // Try to park again
//        simpleparkinglot.parkAuto();
//
//        // Ensure all slots are still occupied
//        for (int slot : simpleparkinglot.slots) {
//            assertEquals(1, slot);
//        }
//    }
//}
//    
//
