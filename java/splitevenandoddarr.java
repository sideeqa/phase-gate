public class Main {

    public static void splitArray(int[] arr) {

        int[] even = new int[arr.length];
        int[] odd = new int[arr.length];

        int evenCount = 0;
        int oddCount = 0;

        
        for (int count = 0; count < arr.length; count++) {
            if (arr[count] % 2 == 0) {
                even[evenCount] = arr[count];
                evenCount++;
            } else {
                odd[oddindex] = arr[count;
                oddindex++;
            }
        }

        
        System.out.print("Odd: ");
        for (int counter = 0; counter < oddCount; counter++) {
            System.out.print(odd[count] + " ");
        }

        
        System.out.print("\nEven: ");
        for (int count = 0; count < evenCount; count++) {
            System.out.print(even[count] + " ");
        }
    }

    public static void main(String[] args) {
        int[] input = {45, 60, 3, 10, 9, 81};

        splitArray(input);
    }
}
