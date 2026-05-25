import java.util.*;

public class nthfibonacci{
    public static int Fib(int n){
        int sum=0;
        if(n==0){
            return 0 ;
        } 
        else if( n==1){
            return 1;
        }
         return Fib(n-1)+Fib(n-2);
    }
    public static void main(String [] args){
        int num=5;
        System.out.println(Fib(num));
    }
}