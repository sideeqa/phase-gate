import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class Testlevel5test{

@Test

    public void testAddTwoNumber(){
    
        level5task testing = new level5task();
        int actual = testing.Numbers(10,11,12,);
        int expected = [10,11,12,-1,-1];
        assertEquals(actual,expected); 
    }

