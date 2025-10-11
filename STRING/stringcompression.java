import java.util.*;

public class stringcompression{
    public static String Substring(String str){
       String strr="";
        for(int i=0;i<str.length();i++){
           Integer count=1;
            
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
                i++;
            }
            strr+=str.charAt(i);
            if(count >1){
                strr+=count.toString();
            }
        }
      return strr;
    }
    public static void main(String [] args){
        String str1="aaabbbbccc";
        String result=Substring(str1);
        System.out.println(result);
    }
}