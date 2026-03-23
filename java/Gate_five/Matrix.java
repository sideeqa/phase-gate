public static int[] flatten(int[][] matrix) {
    int total = 0;

    for (int[] row : matrix) {
        total += row.length;
    }

    int[] result = new int[total];
    int index = 0;

    for (int[] row : matrix) {
        for (int num : row) {
            result[index++] = num;
        }
    }

    return result
