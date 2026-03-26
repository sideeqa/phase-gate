import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class testContactApp{

    @Test
    public void testThatTheContactAppIsWorking(){

    boolean actual =ContactApp.getIfTheNumberIsInTheContactApp();

    boolean expected = true;

    assertEquals(expected , actual);


}



}


