import java.util.*;
 public class TwoSum167{
    public static int []twoSum(int []numbers,int target){
        int start=0;
        int end=numbers.length-1;
        int []ans=new int[2];

        while(start<end){
        
        int sum=numbers[start]+numbers[end];
        if(sum==target){
            ans[0]=start+1;
            ans[1]=end+1;
            return ans;
        }
        else if(sum<target){
            start++;
        }
        else{
            end--;
        }
        }
        return ans;
    }
    public static void main(String[] args){
        int[]  arr={2,7,11,15};
        int[]result=twoSum(arr,9);
        System.out.println(Arrays.toString(result));
    }
    }