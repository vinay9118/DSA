import java.util.*;

public class exponent{
    //NOT OPTIMISED METHOD
    public static int Power(int x,int n){
       if(n==0){
        return 1;
       }
        return Power(x,n-1)*x;
    }

    //OPTIMISED METHOD ==>> time complexity=log(n)
    public static int power(int x,int n){
        if(n==0){
                 return 1;
                }
         int halfpower= power(x,n/2);      
         int half=halfpower*halfpower;
         if(n%2!=0){
                    half=x*half;
                }
        return half;
    }
    //main function
    public static void main(String [] args){
        System.out.println(Power(2,10)+" "+power(2,10));
    }
}