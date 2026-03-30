import java.util.*;
//Important concept
public class AggressiveCows{
    public static int painterParts(int [] nums,int m,int n){
        if(m>n){
            return -1;
        }
        int low=Integer.MAX_VALUE;//low =min(array Element)
        int ans=-1;
        int high=Integer.MIN_VALUE; //high=min(array Element)
        for(int i=0;i<n;i++){
            high=Math.max(high,nums[i]);
            low=Math.min(low,nums[i]);
        }
        int start=low;
        int end=high-low;
        //apply binary search
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isValid(nums,m,n,mid)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static boolean isValid(int[] arr,int m,int n,int mid){
           Arrays.sort(arr); 
           int cows=1;
           int laststall=arr[0];
           for(int i=1;i<n;i++){
            if(arr[i]- laststall >=mid){
                cows++;
                laststall=arr[i];
            }
            if(cows==m){
            return true;
           }
           }

           return false;
    }
    public static void main(String[] args){
        int [] arr={1,2,8,4,9};
        int m=3;
        int n=5;
        System.out.println(painterParts(arr,m,n));
    }
}