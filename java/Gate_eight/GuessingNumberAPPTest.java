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


 @Test
    public void testcollectinginteger(){

        int actual = GuessingnumberApp.integerperseInt(1,101);

        int expected = false;
        
        assertEquals(expected , actual);
    }

   
