import java.util.*;

public class Selectionssort{
    public static int [] selectionsort(int[] num){
        //outer loop 
        for(int i=0;i<num.length-1;i++){
            int max=i;

            //find minimum element from i+1th index
            for(int j=i+1;j<num.length;j++){
                if(num[max]<num[j]){
                    max=j;
                }
            }

            //swap the number
            int temp=num[max];
            num[max]=num[i];
            num[i]=temp;
        }
        //return a sorted(descending array)
        return num;
    }
    public static void main(String[] args){
        int arr[]={5,4,3,2,7};
        int[]result=selectionsort(arr);
        System.out.println(Arrays.toString(result));
    }
}