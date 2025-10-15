import java.util.*;

public class firstlettertouppercase{
    public static String firstuppercase(String s1){

        StringBuilder s= new StringBuilder("");

        char ch=Character.toUpperCase(s1.charAt(0));
        
        s.append(ch);
        
        for(int i=1;i<s1.length();i++){

            if(s1.charAt(i)==' ' && i<s1.length()-1){
                s.append(s1.charAt(i));
                i++;
                s.append(Character.toUpperCase(s1.charAt(i)));

            }
            else{
                s.append(s1.charAt(i));
            }

            
            
        }
        return s.toString();
    }
    public static void main(String [] args){
        String str1="hi, i am veer";
        String result=firstuppercase(str1);
        System.out.println(result);
    }
}