// space and time complexity is of the order O(n);
import java.util.*;
public class Problem_0136_1 {
    public static void main(String[] args) {
        int[] num1 = {2, 2, 1};
        int[] num2 = {4, 1, 2, 1, 2};
        int[] num3 = {1};
        System.out.println(singleNumber(num1));
        System.out.println(singleNumber(num2));
        System.out.println(singleNumber(num3));
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);
        Set<Map.Entry<Integer, Integer>> values = map.entrySet();
        for (Map.Entry<Integer, Integer> val : values) {
            if (val.getValue() == 1) {
                return val.getKey();
            }
        }
        return -1;
    }
}
