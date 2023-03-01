package courseTasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
        int[] nums2 = {2};
        int[] nums1 = {1, 2, 2, 1};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        Map<Integer, Integer> result = new HashMap<>();

        for (int j : nums1) {
            int count = 1;
            if (map1.containsKey(j)) {
                count = map1.get(j) + 1;
            }
            map1.put(j, count);
        }
        for (int i : nums2) {
            int count = 1;
            if (map2.containsKey(i)) {
                count = map2.get(i) + 1;
            }
            map2.put(i, count);
        }

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                if (map2.get(entry.getKey()) < entry.getValue()) {
                    result.put(entry.getKey(), map2.get(entry.getKey()));
                }else{
                    result.put(entry.getKey(), entry.getValue());
                }
            }
        }
        List<Integer> intersection = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            int amount = 0;
            while (amount < entry.getValue()) {
                intersection.add(entry.getKey());
                amount++;
            }
        }
        return intersection.stream().mapToInt(Integer::intValue).toArray();
//        List<Integer> list1 = new java.util.ArrayList<>(Arrays.stream(nums1).boxed().toList());
//        List<Integer> list2 = new java.util.ArrayList<>(Arrays.stream(nums2).boxed().toList());
//        if (list1.size() <= list2.size()) {
//            list1.retainAll(list2);
//            return list1.stream().mapToInt(Integer::intValue).toArray();
//        }
//        list2.retainAll(list1);
//        return list2.stream().mapToInt(Integer::intValue).toArray();

//        List<Integer> intersect = list1.stream()
//                .filter(list2::contains).toList();

//        List<Integer> intersect;
//        if (list1.size() <= list2.size()) {
//            intersect = list1.stream()
//                    .filter(list2::contains).toList();
//        } else {
//            intersect = list2.stream()
//                    .filter(list1::contains).toList();
//        }
//        return intersect.stream().mapToInt(Integer::intValue).toArray();
    }
}
