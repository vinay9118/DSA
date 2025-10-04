import java.util.*;

public class Insertionsort{
    public static int [] insertionsort(int[] num){
        //outer loop   
        for(int i=1;i<num.length;i++){
            int cur=num[i];
            int prev=i-1;
            
            
            while(prev >=0 && num[prev]>cur){
                num[prev+1]=num[prev];
                prev--;
            }

            num[prev+1]=cur;
        }
        return num;
    }
    public static void main(String[] args){
        int arr[]={3,6,2,1,8,7,4,5,3};
        int[]result=insertionsort(arr);
        System.out.println(Arrays.toString(result));
    }
}