import java.util.*;

public class poweroftwo{
   
   //DECIMAL TO BINARY CONVERTER
    public static String Dectobin(int n){
        if(n==0){
            return "0";
        }
        String result="" ;
        while(n>0){
            int re=n%2;
            result=re+result;
            n=n/2;
        }
        
       return result; 
    }
    
    public static boolean Poweroftwo(int n){
          return (n & (n-1)) ==0;
    }
    public static void main(String[] args){
        int num=10;
        System.out.println("Binary Number of First Number:::"+Dectobin(num));
        System.out.println(Poweroftwo(num));
    }

}