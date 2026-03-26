import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class DuplicateTasktest{

    @Test
    public void testDuplicateNumbersAreRemoved_duplicatePresent(){
    int [ number = {9,2,3,2,1}]
    int [] actual =DuplicateTask.nonDuplicateNumber(number);

    int expected = (9,3,1);

    assertEquals(expected , actual);


}

     @Test
    public void testDuplicateNumbersAreRemoved_duplicateNotPresent(){
    int [ number = {9,5,3,2,1}]
    int [] actual =DuplicateTask.nonDuplicateNumber(number);

    int expected = (9,5,3,2,1);

    assertEquals(expected , actual);


}


