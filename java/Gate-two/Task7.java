import java.util.Scanner;
public class Task7{
    public static void main(String[]args){
        int sum = 0;
    Scanner inputCollector = new Scanner(System.in);
    for(int index = 1; index <= 5; index ++){
    System.out.print("Enter 5 number: ");
    int numberEntered = inputCollector.nextInt();

    sum += numberEntered;

}
System.out.println(sum);

}

}
