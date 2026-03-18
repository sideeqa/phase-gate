   
public class LevelFourTask{ublic


    public static int addNumbers(int num1, int num2) {
        int result = num1 + num2;  
        return result;            
    }


    
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;  
        } else {
            return false;  
        }
    }
   
    public static int square(int number) {
        return number * number;
    }
    
    public static double toFahrenheit(double celsius) {
        return (celsius * 9.0/5) + 32;
    }

}
