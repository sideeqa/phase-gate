import java.util.*;

public static int[] removeDuplicate(int[] arr) {
    List<Integer> list = new ArrayList<>();
    Set<Integer> seen = new HashSet<>();

    for (int num : arr) {
        if (!seen.contains(num)) {
            seen.add(num);
            list.add(num);
        }
    }

    int[] result = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
        result[i] = list.get(i);
    }
    return result;
}

