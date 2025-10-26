import java.util.*;
//leetcode 75
public class sort{
    public static int sortColors(int[] nums){
      int n=nums.length;
      int mid=0;
      int low=0;
      int high=n-1;
      while(mid<=high){
        if(nums[mid] == 0){
            int temp=nums[low];
            nums[low]=nums[mid];
            nums[mid]=temp;
            mid++;
            low++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
            int temp=nums[high];
            nums[high]=nums[mid];
            nums[mid]=temp;

        }
      } 
    }
    public static void main(String[] args){
        int [] num={2,0,2,1,1,0,1,2,0,0};
        System.out.println(singleNonDuplicate(num));
    }
}