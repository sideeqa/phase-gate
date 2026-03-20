import java.util.ArrayList;

public class PerfectSquares {

    public static ArrayList<Integer> getPerfectSquares(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                int root = (int) Math.sqrt(num);

                if (root * root == num) {
                    result.add(num);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input = {4, 7, 9, 10, 16, 18};
        ArrayList<Integer> output = getPerfectSquares(input);

        System.out.println(output); // [4, 9, 16]
    }
}
