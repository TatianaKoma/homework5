package jetBrainsTasks;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatingLeetCode {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
//        String s = "lelwetcode";
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i : nums1){
//            int freq = map.getOrDefault(i, 0);
//            map.put(i, freq + 1);
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i : nums2){
//            if(map.get(i) != null && map.get(i) > 0){
//                list.add(i);
//                map.put(i, map.get(i) - 1);
//            }
//        }
//        int[] ret = new int[list.size()];
//        for(int i = 0; i < list.size();i++){
//            ret[i] = list.get(i);
//        }
//        return ret;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }
        List<Integer> list = new ArrayList<>();
        for (int j : nums2) {
            if (map.get(j) != null && map.get(j) > 0) {
                list.add(j);
                map.put(j, map.get(j) - 1);
            }
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
