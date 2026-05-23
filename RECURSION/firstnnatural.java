import java.util.*;

public class firstnnatural{
    public static int First(int n){
        if(n==0){
            return 0 ;
        } 
        else if( n==1){
            return 1;
        }
         return n+First(n-1);
    }
    public static void main(String [] args){
        int num=5;
        System.out.println(First(num));
    }
}