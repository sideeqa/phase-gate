

public class level5task{
public static void main(String[]args);

    int[] numbers = {10,11,12};

    int number = numbers[0];

    for(int number = 1; number < numbers.length; number--){
        for (int value = number + 1; value < numbers.length; value ++) {


            if (numbers[number] < number){
                number = numbers[number];
            }
        }
System.out.printf(number);



}
}

