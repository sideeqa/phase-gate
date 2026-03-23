public static int[] square(int n) {
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
        result[i] = (i + 1) * (i + 1);
    }
    return result;
}
}
