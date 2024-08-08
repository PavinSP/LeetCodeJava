public class Problem_9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
    public static boolean isPalindrome(int x){
        if (x < 0){
            return false;
        }
        int temp = x;
        int rev = 0;
        while (x > 0){
            rev = (rev * 10) + (x % 10);
            x /= 10;
        }
        return temp == rev;
    }
}
