public static int countEven(int[] numbers) {
    int count = 0;
    for (int num : numbers) {
        if (num % 2 == 0) {
            count++;
        }
    }
    return count;
}
