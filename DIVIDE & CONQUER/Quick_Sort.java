import java.util.*;

public class Quick_Sort{
    public static void quick_sort(int [] nums,int si,int ei){
        if(si >= ei){
            return;
        }
        int pIdx=partition(nums,si,ei);
        quick_sort(nums,si,pIdx-1);//left
        quick_sort(nums,pIdx+1,ei);//right
    }
    public static int partition(int[] nums,int si,int ei){
        int pivot=nums[ei];
        int i=si-1;

        for(int j=si;j<ei;j++){
            if(nums[j] <= pivot){
                i++;
                //swap
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        nums[ei]=nums[i];
        nums[i]=temp;
        return i;

    }

    public static void main(String[] args){
        int [] num={6,3,9,5,2,8};
        quick_sort(num ,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }
}