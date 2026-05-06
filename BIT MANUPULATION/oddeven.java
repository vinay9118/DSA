import java.util.*;

public class oddeven{
   
 //APPROACH CONVERT DECIMAL TO BINARY NUMBER AND CHECK LSB IF 0->EVEN OR ODD
    public static String OddEven(int n){
        if(n==0){
            return "EVEN NUMBER";
        }
        String result="" ;
        while(n>0){
            int re=n%2;
            result=re+result;
            n=n/2;
        }
        for(int i=0;i<result.length();i++){
            char ch=result.charAt(result.length()-1);
            if(ch=='1'){
                return "ODD NUMBER";
            }
        }
        return "EVEN NUMBER"; 

    }
    //USING BITMASK APPROACH
        public static String Oddeven(int n){
            if((n & 1)==0){
                return "EVEN";
            }
            return "ODD";
     

    }


    public static void main(String[] args){
        int num=15;
        System.out.println(OddEven(num));
        //USING BIT MASK
        System.out.println(Oddeven(num));

    }
}