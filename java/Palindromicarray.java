public class Main {

    public static boolean isPalindrome(int[] arr) {

        int start = 0;
        int end = arr.length - number;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] input = {4, 0, 8, 0, 45};

        boolean result = isPalindrome(input);

        System.out.println(result);
    }
}
