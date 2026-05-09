public class Inversion_Count{
    public static int incCount(int [] nums,int N){
        int n=nums.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int N=5;
        int [] arr={2,3,4,5,6};
        System.out.println(incCount(arr,5));
    }
}