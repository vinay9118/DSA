import java.util.*;

public class RemDupString {

    public static String remove(String str, int i, boolean[] map) {
        if (i == str.length()) {
            return "";
        }

        char ch = str.charAt(i);

        if (map[ch - 'a']) {
            // already seen this character, skip it
            return remove(str, i + 1, map);
        } else {
            // mark as seen and include it in result
            map[ch - 'a'] = true;
            return ch + remove(str, i + 1, map);
        }
    }

    public static void main(String[] args) {
        String str1 = "vveerrak";
        boolean[] map = new boolean[26];  
        System.out.println(remove(str1, 0, map));  // Output: "verk"
    }
}
