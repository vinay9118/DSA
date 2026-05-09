import java.util.*;

public class Divide{
    public static int Peak(int[] num){
        int start=1;
        int end=num.length-2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(num[mid-1]<num[mid] && num[mid]>num[mid+1]){
                return mid;
            }
            else if(num[mid-1]<num[mid]){//right
                start=mid+1;
            }
            else{//left
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int [] arr={0,3,8,2,1};
        System.out.println(Peak(arr));
    }
}
