public class Main {

    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int count = 2; count < num; count ++) {
            if (num % count == 0) {
                return false;
            }
        }
        return true;
    }

    
    public static int[] getSortedPrimes(int[] arr) {

        int[] temp = new int[arr.length];
        int count = 0;

        
        for (int value = 0; value < arr.length; i++) {
            if (isPrime(arr[value])) {
                temp[count] = arr[value];
                count++;
           }
    }

    public static void main(String[] args) {
        int[] input = {10, 4, 7, 3, 9, 2};

        int[] output = getSortedPrimes(input);

        for (int counter = 0; counter < output.length; counter++) {
            System.out.print(output[counter] + " ");
        }
    }
}
