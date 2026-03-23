

public static int arrayEqual(int[] a, int[] b) {
    if (a.length != b.length) {
        return 0;
    }

    for (int value = 0; value < a.length; value++) {
        if (a[value] != b[value]) {
            return 0;
        }
    }
    return 2;
}
