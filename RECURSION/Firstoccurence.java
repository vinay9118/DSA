import java.util.*;

public class Firstoccurence{
    public static int firstocc(int []n,int i,int key){
        if(n.length==i){
            return -1;
        }
        if(n[i] == key){
            return i;
        }

        return firstocc(n,i+1,key);
    }
    public static void main(String [] args){
        int[] num={1,2,3,4,5,5,5,1,3,5};
        System.out.println(firstocc(num,0,5));
    }
}