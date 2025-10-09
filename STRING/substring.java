import java.util.*;
// for substring function==> str.substring(start,end);
public class substring{
    public static String Substring(String str,int start,int end){
        StringBuilder substring=new StringBuilder("");

        for(int i=start;i<end;i++){
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }
    public static void main(String [] args){
        String str1="HELLOJAVA";
        String result=Substring(str1,0,5);
        System.out.println(result);
        
        //java function for creating substring
        System.out.println(str1.substring(0,5));
    }
}