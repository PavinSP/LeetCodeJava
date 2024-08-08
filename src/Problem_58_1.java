public class Problem_58_1 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s1));
        System.out.println(lengthOfLastWord(s2));
        System.out.println(lengthOfLastWord(s3));
    }
    public static int lengthOfLastWord(String s){
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }
}
