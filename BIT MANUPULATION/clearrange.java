import java.util.*;

public class clearrange{
   
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
    
    public static int Clearrange(int n,int i,int j){   
            int a=((~0)<<(j+1));
            int b=(1<<i)-1;
            int bitMask=a|b;
          return (n & bitMask);
    }
    public static void main(String[] args){
        int num=10;
        System.out.println("Binary Number of First Number:::"+Dectobin(num));
        System.out.println(Clearrange(num,2,4));
    }
}