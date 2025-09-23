import java.util.*;
public class maxsubarraybrute{
    public static void subarray(int [] nums){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;


        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i+1;j<nums.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    //subarray sum
                    currsum+=nums[k];
                }
                System.out.println(currsum);
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