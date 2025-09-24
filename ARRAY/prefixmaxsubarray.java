import java.util.*;
public class prefixmaxsubarray{
    public static void subarray(int [] nums){
        int n=nums.length;
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int[] prefix=new int[n];

        prefix[0]=nums[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }

        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i+1;j<nums.length;j++){
                int end=j;
                //calculate sum each subarray
                currsum=start==0 ? prefix[end]: prefix[end]-prefix[start-1];
                //print sum of subarray
                System.out.println(currsum);
                //find maximum subarray sum
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("max sum="+ maxsum);
    }
  
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size::");
        int n=sc.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter An Element::");
            arr[i]=sc.nextInt();
        }
        subarray(arr);
        // System.out.println(Arrays.toString(result));
    }
}