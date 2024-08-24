// worst time complexity, avoid it
import java.util.*;
public class Problem_0136_2 {
    public static void main(String[] args) {
        int[] num1 = {2, 2, 1};
        int[] num2 = {4, 1, 2, 1, 2};
        int[] num3 = {1};
        System.out.println(singleNumber(num1));
        System.out.println(singleNumber(num2));
        System.out.println(singleNumber(num3));
    }

    public static int singleNumber(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            if (arr.contains(num)) {
                arr.remove((Integer) num);
            }
            else{
                arr.add(num);
            }
        }
        return arr.get(0);
    }
}
/*
In Java, the ArrayList class has two different remove() methods:
remove(int index): This method removes the element at the specified index.
remove(Object o): This method removes the first occurrence of the specified element (by value) from the list, if it is present.
*/