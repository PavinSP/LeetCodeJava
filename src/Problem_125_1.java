public class Problem_125_1 {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
    }
    public static boolean isValid(String s){
        if (s.length() <= 1) return true;
        int start = 0;
        int end = s.length() - 1;
        while (start < end){
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
