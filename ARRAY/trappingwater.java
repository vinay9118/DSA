import java.util.*;
public class trappingwater{
    public static int trap(int [] height){
        int n=height.length;
        int [] left=new int[n];
        int [] right=new int[n];

        left[0]=height[0];
        right[n-1]=height[n-1];
        int waterlevel=0;
        int trappedwater=0;

        //calculate left max boundary
        for(int i=1 ; i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        System.out.println("left max boundary:"+Arrays.toString(left));

        //calculate right max boundary
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        System.out.println("Right max boundary"+Arrays.toString(right));


        //calculate water level
        for(int i=0;i<n;i++){
             waterlevel=Math.min(left[i],right[i]);
             trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
    }
  
    public static void main(String[] args){
        int [] arr={4,2,0,3,2,5};
        int result=trap(arr);
        System.out.print("trapped water:"+result); 
        
      
    }
}