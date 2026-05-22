import java.util.*;

public class decreasing{
    public static void Decreasing(int n){
        if(n==1){
            System.out.print(" "+n);
            return ;
        }
        System.out.print(n+" ");
        Decreasing(n-1);
    }
    public static void main(String [] args){
        int num=10;
        Decreasing(num);
    }
}