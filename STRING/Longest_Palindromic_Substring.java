public class Longest_Palindromic_Substring {

    public static String longestPalindrome(String s) {
        int n = s.length();
        if (n < 2) return s;

        int start = 0, maxLen = 1;

        for (int i = 0; i < n; i++) {
            // Odd length palindromes
            int len1 = expand(s, i, i);
            // Even length palindromes
            int len2 = expand(s, i, i + 1);

            int len = Math.max(len1, len2);

            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, start + maxLen);
    }

    private static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
        public static void main(String[] args) {
        String s = "babad"; // already defined input

        System.out.println(longestPalindrome(s));
    }
}
