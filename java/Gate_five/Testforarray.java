import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class Testforarray{

@Test

    public void testcountEven(){
    
        forarray testing = new forarray();
        int[]arr1actual = testing.countEven(1,2,3,4,5,6);
        int expected = [3];
        assertEquals(actual,expected); 
    }

@Test

    public void testlinearsearch(){
    
        linearsearch testing = new linearsearch();
        int[]arr2actual = testing.linearsearch{10,20,30,40,}
        int[]arr2 expected = [2,-1];
        assertEquals(actual,expected); 
    }


  
@Test

    public void testSquare(){
    
        Square testing = new Square();
        int[] Square actual = testing.Square {5}
        int[] expected = [25];
        assertEquals(actual,expected); 
    }

@Test

    public void testarrayequal(){
    
        arrayEqualtesting = new arrayEqual();
        int[]arr2actual = testing.arrayEqual{1,2,3};
        int[]arr2 expected = [true];
        assertEquals(actual,expected);
