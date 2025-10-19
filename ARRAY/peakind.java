import java.util.*;
//leetcode 852
public class peakind{
    public static int peakIndexInMountainArray(int[] arr){
        int start=1;
        int end=arr.length-2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid-1]<arr[mid]){//right
                start=mid+1;
            }
            else{//left
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [] num={0,10,5,2};
        System.out.println(peakIndexInMountainArray(num));
    }
}