import java.util.Arrays;

public class Problem_0137_2 {
    public static void main(String[] args) {
        int[] nums1 = {2, 2, 3, 2};
        int[] nums2 = {0, 1, 0, 1, 0, 1, 99};
        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber(nums2));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1 || nums[0] != nums[1]) {
            return nums[0];
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }
        for (int i = 1; i < nums.length; i += 3) {
            if (nums[i] != nums[i - 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}