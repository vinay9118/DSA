import java.util.*;
public class product{
    public static int[] productexceptself(int [] nums){
        int n=nums.length;
         int [] right=new int[n];
        int product=1;
         for(int i=n-1;i>=0;i--){
            product=product*nums[i];
            right[i]=product;
         }
         int[] ans=new int[n];
         int left=1;
         for(int i=0;i<n-1;i++){
            int val=left*right[i+1];
            ans[i]=val;
            left=left*nums[i];
         }
        ans[n-1]=left;
        return ans;
    }
    public static  void main(String [] args){
        //Input
        int [] num={1,2,3,4};
        int[] result=productexceptself(num);
                System.out.println(Arrays.toString(result));
    }
}