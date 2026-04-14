import java.util.*;
 public class SquareofSortedArray{
     public static int[] sortedSquares(int[] nums){
        int start=0;
        int end=nums.length-1;
        int [] newarr=new int[nums.length];
        int ptr=newarr.length-1;
        while(start<=end &&ptr >=0){
            int n1=nums[start]*nums[start];
            int n2=nums[end]*nums[end];
            if(n1 >n2){
                newarr[ptr]=n1;
                start++;
            }
            else{
                newarr[ptr]=n2;
                end--;   
            }
            ptr--;
        }
        return newarr;
     }
    public static void main(String[] args){
        //Input
        int[]  arr={-4,-1,0,3,10};
        int[] result=sortedSquares(arr);
        System.out.println(Arrays.toString(result));
    }
 }