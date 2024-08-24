// best solution
public class Problem_136_3 {
    public static void main(String[] args) {
        int[] num1 = {2, 2, 1};
        int[] num2 = {4, 1, 2, 1, 2};
        int[] num3 = {1};
        System.out.println(singleNumber(num1));
        System.out.println(singleNumber(num2));
        System.out.println(singleNumber(num3));
    }

    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
