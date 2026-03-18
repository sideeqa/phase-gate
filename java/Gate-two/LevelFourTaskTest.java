// Compile with the JAR on the classpath
//javac -cp .:junit-platform-console-standalone-1.13.4.jar TestClass.java
//
//# 2. Run using the 'execute' subcommand and explicit class selection
//java -jar junit-platform-console-standalone-1.13.4.jar execute --class-path . --select-class TestClass --details=verbose


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class LevelFourTaskTest{

    @Test
    public void testAddTwoNumber(){
    
        level4Task testing = new level4Task();
        int actual = testing.addNumbers(5,3);
        int expected = 8;
        assertEquals(actual,expected); 
    }


    @Test
    public void testTheNumberIsEven(){
    
        level4Task testing = new level4Task();
        boolean actual = testing.isEven(4);
        boolean expected = true;
        assertEquals(actual,expected); 
    }

    @Test
    public void testSquareOfANumber(){    
        level4Task testing = new level4Task();
        int actual= testing.square(5);
        int expected = 25;
        assertEquals(actual,expected);
    } 

//    @Test
//    public void testToConvertCelciusToFahrenheits(){
//    
//        level4Task testing = new level4Task();
//        int actual = testing.toFahrenheit(0);
//        int expected = 32;
//        assertEquals(actual,expected); 
//
//
//    }

}


