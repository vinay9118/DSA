import java.util.*;

public class dectobin{
   
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
        int num=9;
        String result=Dectobin(num);
        System.out.println("DECIMAL TO BINARY NUMBER:"+result);
        System.out.println(Bintodec(result));
    }
}