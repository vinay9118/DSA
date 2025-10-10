import java.util.*;
public class palindrome{
    public static boolean isPalindrome(String str1){
       for(int i=0;i<str1.length()/2;i++){
        if(str1.charAt(i)!=str1
        .charAt(str1.length()-1-i)){
            return false;
        }
       }
        return true;
    }
    public static boolean isPalindrome125(String s){
        if(s.length()==1){
            return true;
        }
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch>='a' && ch<='z'){
                str.append(ch);
            }
            else if(ch>='A' && ch<='Z'){
                str.append(ch);
            }
            else if(ch>='0' && ch<='9') {
                str.append(ch);
            }
        }
           int start=0;
           int end=str.length()-1;
           while(start<end){

            int left=str.charAt(start);
            int right=str.charAt(end);
            if(left!=right){
                return false;
            }
            start++;
            end--;

           }
        return true;
    }
    public static void main(String[] args){
        String str="racear";
        boolean res=isPalindrome(str);
        boolean result=isPalindrome125(str);
        System.out.println("USING DIRECT METHOD:::"+res);
        System.out.println("USING LEETCODE APPROACH:::"+result);
    }
}