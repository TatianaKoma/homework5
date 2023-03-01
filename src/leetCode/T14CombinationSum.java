package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class T14CombinationSum {
//    public static void main(String[] args) {
//        int[] array = new int[]{2, 4, 6, 8};
//        System.out.println(combinationSum(array, 8));
//    }
////
//    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
//        Set<List<Integer>> allCombinations = new HashSet<>();
//        List<Integer> oneCombination = new ArrayList<>();
//        if (getCombCheckingSumOfElements(candidates, target).get(0).size() != 0) {
//            allCombinations = new HashSet<>(getCombCheckingSumOfElements(candidates, target));
//        }
//        for (int i = 0; i < candidates.length; i++) {
//            int rest = target % candidates[i];
//            int amountOfAdding = target / candidates[i];
//            if (rest == 0) {
//                oneCombination = getComb(candidates[i], amountOfAdding);
//            } else {
//
//            }
//            allCombinations.add(oneCombination);
//        }
//
//        return new ArrayList<>(allCombinations);
//    }
//
//    private static List<Integer> getComb(int candidate, int amountOfAdding) {
//        List<Integer> comb = new ArrayList<>();
//        for (int i = 0; i < amountOfAdding; i++) {
//            comb.add(candidate);
//        }
//        return comb;
//    }
//
//    private static List<List<Integer>> getCombCheckingSumOfElements(int[] candidates, int target) {
//        Set<List<Integer>> allCombinations = new HashSet<>();
//        List<Integer> comb = new ArrayList<>();
//        for (int i = 0; i < candidates.length - 1; i++) {
//            for (int j = i + 1; j < candidates.length; j++) {
//                if ((candidates[i] + candidates[j]) == target) {
//                    comb.add(candidates[i]);
//                    comb.add(candidates[j]);
//                }
//            }
//            allCombinations.add(comb);
//        }
//        return new ArrayList<>(allCombinations);
//    }

//    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
//        Arrays.sort(candidates);
//        return findCombine(candidates, target, 0);
//    }
//
//    public static List<List<Integer>> findCombine(int[] candidates, int target, int index) {
//        List<List<Integer>> allComb = new LinkedList<>();
//        for (int i = index; i < candidates.length; i++) {
//            int tmp = target - candidates[i];
//            if (tmp == 0) {
//                List<Integer> comb = new ArrayList<>();
//                comb.add(candidates[i]);
//                allComb.add(comb);
//                return allComb;
//            } else if (tmp > 0) {
//                List<List<Integer>> tmp_list = findCombine(candidates, tmp, i);
//                for (List<Integer> list : tmp_list) {
//                   list.add(0, candidates[i]);
//                    allComb.add(list);
//                }
//            }
//        }
//        return allComb;
//    }

public class T14CombinationSum {
    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 6, 8};
        System.out.println(combinationSum(array, 8));
    }

    static List<List<Integer>> allComb;

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        allComb = new ArrayList<>();
        int len = candidates.length;
        List<Integer> tmp = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        for (int candidate : candidates) {
            rem.add(candidate);
        }
        func(tmp, rem, target);
        return allComb;
    }

    private static void func(List<Integer> tmp, List<Integer> rem, int target) {
        if (getSum(tmp) == target) {
            allComb.add(tmp);
            return;
        }
        if (getSum(tmp) < target) {
            for (int i = 0; i < rem.size(); i++) {
                List<Integer> tmp1 = new ArrayList<>(tmp);
                tmp1.add(rem.get((int) i));
                if (getSum(tmp1) > target) break;
                List<Integer> rem1 = new ArrayList<>();
                for (int j = i; j < rem.size(); j++)
                    rem1.add(rem.get((int) j));
                func(tmp1, rem1, target);
            }
        }
    }

    private static int getSum(List<Integer> tmp) {
        int sum = 0;
        for (int x : tmp)
            sum += x;
        return sum;
    }
}

