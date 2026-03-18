

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class functiontasktest{

@Test

    public void testfunctiontasktest(){
    
        functiontask testing = new level5task();
        string actual = testing letters("1AaaBBc");
        String expected = ["A1a2B2c1"];
        assertEquals(actual,expected); 
    }

