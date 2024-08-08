public class Problem_28 {
    public static void main(String[] args) {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println(strStr(haystack1, needle1));
        System.out.println(strStr(haystack2, needle2));
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.substring(i, needle.length() + i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}