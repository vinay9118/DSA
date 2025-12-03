import java.util.*;
//leetcode 50
public class Pow50{
    public static double myPow(double x,int n){
        if(n==0 ||x==1){
            return 1.0;
        }
        if(x ==0){return 0.0;}
        if( x== -1 && n%2 ==0){ return 1.0;}
        if( x== -1 && n%2 !=0){ return -1.0;}
        long bin=n;
        if(n<0){
            x=1/x;
            bin=-bin;
        }
        double ans=1;
        while(bin>0){
            if(bin%2==1){
                ans*=x;
            }
            x*=x;
            bin/=2;
        }
       return ans;
    }
    public static void main(String[] args){
        double x1=2.10000;
        int n3=3;
        System.out.println(myPow(x1,n3));
    }
}