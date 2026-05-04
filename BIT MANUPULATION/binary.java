import java.util.*;

public class binary{
   
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
    //BINARY TO DECIMAL CONVERTER
    public static int Bintodec(String num1){
         int res=0;
        for(int i=0;i<num1.length();i++){
            char n=num1.charAt(num1.length()-1-i);
            if(n=='1'){
                 res=res+(int)Math.pow(2,i);
            }
        }
        return res;

    }

    public static void main(String[] args){
        int num=5;
        int num2=4;
        System.out.println("Binary Number of First Number:::"+Dectobin(num));
        System.out.println("Binary Number of Second Number:::"+Dectobin(num2));
        System.out.println("BITWISE AND OPERATION------>" +(num &num2));
        System.out.println("BITWISE OR OPERATION------>" +(num | num2));
        System.out.println("BITWISE XOR OPERATION------>" +(num ^ num2));
        System.out.println("BITWISE 1'S COMPLEMENT OPERATION------>" +(~num));
        System.out.println("BITWISE 2'S COMPLEMRNT OPERATION------>" +(~num+1));
        System.out.println("BITWISE OPERATION------>" +(~0));

        //BINARY LEFT SHIFT a<<b=a*2 ki power b
        System.out.println("BINARY LEFT SHIFT OPERATION(A*POW(2,B))------>" + (5<<2));

        //BINARY RIGHT SHIFT a<<b=a*2 ki power b
        System.out.println("BINARY RIGHT SHIFT OPERATION(A/POW(2,B))------>" + (5>>2));

        
    }

}