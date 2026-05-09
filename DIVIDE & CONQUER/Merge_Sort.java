import java.util.*;

public class Merge_Sort{
    public static int[] merge_sort(int [] nums,int si,int ei){
        if(si >= ei){
            return nums;
        }

       int mid=si+(ei-si)/2;
       merge_sort(nums,si,mid);
       merge_sort(nums,mid+1,ei);
       return merging(nums,si,mid,ei);  
    }
    public static int[] merging(int[] nums,int si,int mid,int ei){
        int []temp=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<= mid && j<=ei){
            if(nums[i]<nums[j]){
                temp[k]=nums[i];
                i++;
            }
            else{
                temp[k]=nums[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        //right part
         while(j<=ei){
            temp[k++]=nums[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            nums[i]=temp[k];
        }
        return temp;
    }

    public static void main(String[] args){
        int [] num={6,3,9,5,2,8};
        int []result= merge_sort(num ,0,num.length-1);
        System.out.println(Arrays.toString(result));
    }
}