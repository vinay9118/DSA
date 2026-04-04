import java.util.*;
public class kadan{
    public static int maxsubsum(int [] nums){
    int currsum=nums[0];
    int maxsum=nums[0];
    for(int i=1;i<nums.length;i++){
       if(currsum+nums[i]>nums[i]){
        currsum+=nums[i];
       }
       else{
        currsum=nums[i];
       }
       maxsum=Math.max(maxsum,currsum);
    }
    return maxsum;
    }
  
    public static void main(String[] args){
        //Input 
        int [] arr={-2,-3,4,-1,-2,1,5,-3};
        int result=maxsubsum(arr);
        System.out.print("maximum sum of subarray:"+result); 
        
      
    }
}