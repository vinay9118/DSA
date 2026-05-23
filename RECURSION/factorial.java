import java.util.*;

public class factorial{
    public static int Fact(int n){
        if(n==0){
            return 1 ;
        } 
        else if( n==1){
            return 1;
        }
         return n*Fact(n-1);
    }
    public static void main(String [] args){
        int num=5;
        System.out.println(Fact(num));
    }
}