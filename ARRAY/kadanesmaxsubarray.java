import java.util.*;
public class kadanesmaxsubarray{
    public static int subarray(int [] nums){
    int currsum=0;
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        currsum=currsum+nums[i];
        if(currsum<0){
            currsum=0;
        }
        maxsum=Math.max(currsum,maxsum);
    }
    return maxsum;
    }
  
    public static void main(String[] args){
        // alternative solution for Maximum Subarray (Kadane's Algorithm)
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size::");
        int n=sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter An Element::");
            arr[i]=sc.nextInt();
        }
        int result=subarray(arr);
        System.out.print("maximum sum of subarray:"+result); 
        
      
    }
}