import java.util.*;

public class PerOfString{
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] fre = new int[26];
        int[] windowFre = new int[26];
        int windSize = s1.length();

        // Count frequency of characters in s1
        for (int i = 0; i < s1.length(); i++) {
            fre[s1.charAt(i) - 'a']++;
            windowFre[s2.charAt(i) - 'a']++;
        }

        for (int i = windSize; i < s2.length(); i++) {
            if (Arrays.equals(fre, windowFre)) {
                return true;
            }

            windowFre[s2.charAt(i) - 'a']++; 
            windowFre[s2.charAt(i - windSize) - 'a']--; 
        }

      
        return Arrays.equals(fre, windowFre);
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));  // Output: true
    }
}
