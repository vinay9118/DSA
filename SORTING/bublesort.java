import java.util.*;

public class bublesort{
    public static int [] Bublesort(int[] num){

        for(int i=0;i<num.length-1;i++){
            for(int j=0;j<num.length-1;j++){
                if(num[j] > num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        return num;
    }
    public static void main(String[] args){
        //Input data
        int arr[]={3,6,2,1,8,7,4,5,3};
        int[]result=Bublesort(arr);
        System.out.println(Arrays.toString(result));
    }
}