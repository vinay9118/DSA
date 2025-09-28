
import java.util.*;

public class MajorityElement{
    //Moores voting algorithm
    public static int majorityElement(int[] nums){
      int freq=0;
      int ans=0;
      for(int i=0;i<nums.length;i++){
        if(freq ==0){
            ans=nums[i];
            freq=1;
        }
        else if(ans ==nums[i]){
            freq++;
        }
        else{
            freq--;
        }
      }
      return ans;
    }
    public static void main(String[] args){
        int [] num={1,2,2,1,1};
        System.out.println("Moores Voting algorithm::"+majorityElement(num));
        System.out.println("Brute Force::"+majority(num));
    }
    //brute Force approach
    public static int majority(int [] nums){
        Arrays.sort(nums);
        int freq=1;
        int ans=nums[0];
       for(int i=1;i<nums.length;i++){
         if(nums[i]==nums[i-1]){
            freq++;
         }
         else{
            freq=1;
            ans=nums[i];
         }
         if(freq>nums.length/2){
            return ans;
         }  
       }
       return ans;

    }

}