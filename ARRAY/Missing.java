import java.util.*;
public class Missing{
    public static int missing(int [] nums){
          int n=nums.length;
          int actualsum=(n*(n+1))/2;
          int currentsum=0;
          for(int i=0;i<n;i++){
            currentsum=currentsum+nums[i];
          }
          int ans=actualsum-currentsum;
         return ans;

    }
    public static void main(String [] args){
        int [] num={0,1};
        int result=missing(num);
        System.out.println(result);
    }
}