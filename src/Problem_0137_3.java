public class Problem_0137_3 {
    public static void main(String[] args) {
        int[] nums1 = {30000, 500, 100, 30000, 100, 30000, 100};
        int[] nums2 = {0, 1, 0, 1, 0, 1, 99};
        System.out.println(singleNumber(nums1));
        System.out.println(singleNumber(nums2));
    }

    public static int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
}