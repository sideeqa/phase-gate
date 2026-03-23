public static int linearSearch(int[] numbers, int target) {
    for (int count = 0; count < numbers.length; count++) {
        if (numbers[count] == target) {
            return count;
        }
    }
    return -1;
}
