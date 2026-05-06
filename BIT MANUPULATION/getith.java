import java.util.*;

public class getith{
   
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
    
    public static int Getith(int n,int i){
        // replace zero with all palces except i th position 
        int bitmask=1<<i;
        //for checking ith place zero or one
        if((n & bitmask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args){
        int num=10;
        System.out.println("Binary Number of First Number:::"+Dectobin(num));
        System.out.println(Getith(num,3));

        
    }

}