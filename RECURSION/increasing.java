import java.util.*;
//print number in increasing oreder using recursion
public class increasing{
    public static void Increasing(int n){
       if(n==1){
            System.out.print(n+" ");
            return ;
        }
        Increasing(n-1);
        System.out.print(n+" ");
       
    }
    public static void main(String [] args){
        int num=10;
        Increasing(num);
    }
}