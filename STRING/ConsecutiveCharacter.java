import java.util.*;

public class ConsecutiveCharacter{
    public static int maxPower(String s){
        int count=1;
        int max=1;
        for(int i=1; i<s.length();i++){
          int curr=s.charAt(i);
          int prev=s.charAt(i-1);
          if(curr == prev){
            count++;
          }
          else{
            max=Math.max(max,count);
            count=1;
          }
        }  
        max=Math.max(max,count);
        return max;
    }
    public static void main(String[]args){
          String s="leetcooode";
          System.out.println(maxPower(s));

    }
}