import java.util.*;

public class countsetbit{
   
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
    
    public static int Setbit(int n){
        int count=0;
        while(n>0){
            if((n & 1)!=0){ //check our LSB
                count++;
            }
            n=n>>1;
        }
        return count; 
    }
    public static void main(String[] args){
        int num=15;
        System.out.println("Binary Number of First Number:::"+Dectobin(num));
        System.out.println(Setbit(num));
    }

}