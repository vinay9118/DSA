import java.util.*;

public class lastoccurence{
    public static int lastocc(int []n,int i,int key){
        if(i == 0 ){
            return -1;
        }
        if(n[i] == key){
            return i;
        }

        return lastocc(n,i-1,key);
    }
    public static void main(String [] args){
        int[] num={1,2,3,4,5,5,5,1,3,5};
        System.out.println(lastocc(num,num.length-1,5));
    }
}