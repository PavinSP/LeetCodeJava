import java.util.*;
public class Problem_137_1 {
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 3, 2};
        int[] nums2 = {0, 1, 0, 1, 0, 1, 99};
        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber(nums2));
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Map.Entry<Integer, Integer>> values = map.entrySet();
        for (Map.Entry<Integer, Integer> x : values){
            if (x.getValue() == 1){
                return x.getKey();
            }
        }
        return -1;
    }
}
