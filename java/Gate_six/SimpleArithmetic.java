//import security secureRandom
//random number
//get the first number and the seccond number
//generate  a random number and subtract in random
//
//
//


//import java.util.Scanner;
//import java.security.SecureRandom;
//    
//    public class SimpleArithmetic{
//
//public static void main(String[]args){
//
//Scanner obtained = new Scanner(System.in);
//SecureRandom Random = new SecureRandom();
//count = 1;
//    int firstnumber = Random.nextInt(50,100);
//
//    int secondnumber = Random.nextInt(1,50);
//
//    int numbers = obtained.nextInt();
//
//    System.out.print("generate question");
//
//
//}
//
//    for(int count = 2; count <= 10; count ++){
//
//        for(int counter = 1; counter >= 10; counter --){
//
//
//            int subtractcounter = count - counter;
//
//               count++;
//            int randomsubtraction = 1 + Random.nextInt(question);
//                count++;
//            System.out.print("question);
//
//    
//
//
//
//
//
//}
//}
//
//}
//
//




import java.util.Scanner;
import java.security.SecureRandom;

public class SimpleArithmetic {

    public static void main(String[] args) {

        Scanner obtained = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        int count = 1;

        while (count <= 10) {

            int firstnumber = random.nextInt(50, 100);
            int secondnumber = random.nextInt(1, 50);

            int answer = firstnumber - secondnumber;

            System.out.println("Question " + count + ": ");
            System.out.print(firstnumber + " - " + secondnumber + " = ");

            int userAnswer = obtained.nextInt();

            if (userAnswer == answer) {
                System.out.println("Correct ");
            } else {
                System.out.println("Wrong  Answer is " + answer);
            }

            count++;
        }

       
    }
}



