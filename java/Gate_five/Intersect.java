import java.util.*;

public static int[] intersectOf(int[] a, int[] b) {
    Set<Integer> setA = new HashSet<>();
    Set<Integer> resultSet = new HashSet<>();

    for (int num : a) {
        setA.add(num);
    }

    for (int num : b) {
        if (setA.contains(num)) {
            resultSet.add(num);
        }
    }

    int[] result = new int[resultSet.size()];
    int count = 0;
    for (int num : resultSet) {
        result[count++] = num;
    }

    return result;
}

