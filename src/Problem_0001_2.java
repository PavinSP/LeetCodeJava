// Two pass method // Not recommended
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Problem_0001_2 {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int[] nums2 = {3, 2, 4};
        int[] nums3 = {3, 3};
        int target1 = 9;
        int target2 = 6;
        int target3 = 6;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
    }
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if (map.containsKey(difference) && map.get(difference) != i){
                return new int[]{i, map.get(difference)};
            }
        }
        return null;
    }
}