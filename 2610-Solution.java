import java.util.*;

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> result = new ArrayList<>();
        while (!freq.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            List<Integer> toRemove = new ArrayList<>();
            for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
                row.add(e.getKey());
                e.setValue(e.getValue() - 1);
                if (e.getValue() == 0) {
                    toRemove.add(e.getKey());
                }
            }
            for (int key : toRemove) {
                freq.remove(key);
            }
            result.add(row);
        }
        return result;
    }
}
