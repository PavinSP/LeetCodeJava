// Two pointer method (watch video for clear understanding)
public class Problem_0011 {
    public static void main(String[] args) {
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height1));
        int[] height2 = {1, 1};
        System.out.println(maxArea(height2));
    }
    public static int maxArea(int[] height){
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(area, maxArea);
            if (height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}
