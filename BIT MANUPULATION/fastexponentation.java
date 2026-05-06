import java.util.*;

public class fastexponentation{
   
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


    public static int Fastexponentation(int a,int n){
        int ans=1;
        while(n>0){
            if((n & 1) !=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
          return ans;
    }

    public static void main(String[] args){
        int num=5;
        System.out.println("Binary Number of First Number:::"+Dectobin(num));
        System.out.println(Fastexponentation(num,4));
    }

}