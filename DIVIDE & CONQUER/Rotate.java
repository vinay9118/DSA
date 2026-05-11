public class Rotate{

    public static int Rotate_Sorted(int [] nums,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;

        if(nums[mid]==target){
            return mid;
        }

        if(nums[start]<=nums[mid])
        {
         if(nums[start]<=target &&  target<=nums[mid]){
            return Rotate_Sorted(nums,target,start,mid);
          }
         else{
            return Rotate_Sorted(nums,target,mid+1,end);
             }
        }
        else{
            if(nums[mid]<=target && target <= nums[end]){
                return Rotate_Sorted(nums,target,mid+1,end);
            }
            else{
                return Rotate_Sorted(nums,target,start,mid-1);
            }
        }

 
    }

    public static void main(String [] args){
        int [] arr={4,5,6,7,0,1,2};
        int target=6;
        System.out.println(Rotate_Sorted(arr,target,0,arr.length));
    }
}