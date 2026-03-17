// Compile with the JAR on the classpath
//javac -cp .:junit-platform-console-standalone-1.13.4.jar TestClass.java
//
//# 2. Run using the 'execute' subcommand and explicit class selection
//java -jar junit-platform-console-standalone-1.13.4.jar execute --class-path . --select-class TestClass --details=verbose


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertion;AssertTrue;
import org.junit.jupiter.api.Assertion;AssertEquals;

@Test

public void testingAddTwoNumber();
    
    level4task testing = new level4task();
    int actualResult = testing.addition;
    int ExpectedResult = 8;
    assertEquals(actualResult,expectedResult); 


@Test

public void testingTheNumberIsEven();
    
    level4task testing = new level4task();
    int actualResult = testing.numberIsEven;
    int ExpectedResult = 4;
    assertEquals(actualResult,expectedResult); 

@Test

public void testingSquareOfANumber();
    
    level4task testing = new level4task();
    int actualResult = testing.square;
    int ExpectedResult = 25;
    assertEquals(actualResult,expectedResult); 

@Test

public void testingToConvertCelciusToFahrenheits();
    
    level4task testing = new level4task();
    int actualResult = testing.fahrenheit;
    int ExpectedResult = 5/9 + 32;
    assertEquals(actualResult,ExpectedResult); 


