package Basic_Java_26._01_23_3;

import java.util.HashMap;

public class ArrayOperations {
    public int countPairs(int[] arr, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(k - i)) {
                count += map.get(k - i);
            }
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        return count;
    }
}
