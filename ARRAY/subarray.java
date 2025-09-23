import java.util.*;
public class subarray{
    public static void subarray(int [] nums){
        for(int i=0;i<nums.length;i++){
            int start=i;
            for(int j=i+1;j<nums.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            }
             System.out.println();
        }
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