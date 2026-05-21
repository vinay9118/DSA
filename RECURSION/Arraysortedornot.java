import java.util.*;

public class Arraysortedornot{
    public static  boolean isSorted(int []n,int i){
        if(i == n.length-1){
            return true;
        }
        if(n[i] >n[i+1]){
            return false;
        }
        return isSorted(n,i+1);
    }
    public static void main(String [] args){
        int[] num={1,2,3,4};
        System.out.println(isSorted(num,0));
    }
}