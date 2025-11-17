import java.util.*;
 public class maxarea{
    public static int maxArea(int []height){
        int start=0;
        int end=height.length-1;

        int maxcap=0;
        while(start<end){
            int h=Math.min(height[start],height[end]);
            int width=end-start;
            
            int curcap=h*width;
            maxcap=Math.max(curcap,maxcap); 

            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }

        }
        return maxcap;
    }
    public static void main(String[] args){
        int[] arr={1,8,6,2,5,4,8,3,7};
        int result=maxArea(arr);
        System.out.println(result);
    }
 }