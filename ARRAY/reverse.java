import java.util.*;
public class reverse{
    public static int[] reverse(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
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
        int[] result=reverse(arr);
        System.out.println(Arrays.toString(result));
    }
}