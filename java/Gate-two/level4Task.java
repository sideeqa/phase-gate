 public class main{

   
    public static int addNumbers(int num1, int num2) {
        int result = num1 + num2;  
        return result;            
    }

    public static void main(String[] args) {
        int answer = addNumbers;
        System.out.println(answer);    
    }
}




public class main{

    
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;  
        } else {
            return false;  
        }
    }

    public static void main(String[] args) {
        System.out.println(isEven(4)); 
        System.out.println(isEven(7)); 
    }
}



public class main{

   
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int result = square(5);
        System.out.println(result); 
    }
}



public class main{

    
    public static double toFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        double result = toFahrenheit(25);
        System.out.println(result);
    }
}
