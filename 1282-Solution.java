import java.util.*;
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int ind = 0; ind < groupSizes.length; ind++) {
            int size = groupSizes[ind];
            map.putIfAbsent(size, new ArrayList<>());
            List<Integer> group = map.get(size);
            group.add(ind);
            if (group.size() == size) {
                result.add(new ArrayList<>(group));
                group.clear();
            }
        }
        return result;
    }
}
