import java.util.*;
//leetcode 28
public class leetcode28{
     public static int strStr(String haystack,String needle){
            int n=needle.length();
            int s=haystack.length();
            if(n==0){
                return 0;
            }
            for (int i = 0; i <= s - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1; 
        }
    public static void main(String[] args){
        String str1="leetcode";
        String str2="tco";
        System.out.println(strStr(str1,str2));
    }
}