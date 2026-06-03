
import java.util.ArrayList;

public class Most_Frequent_Number_Key {
    public static int findfrequent(ArrayList<Integer>nums,int key){
        int []ans=new int[1000];

        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i)==key){
                ans[nums.get(i+1)-1]++;
            }
        }
        int max=Integer.MIN_VALUE;
        int result=0;
        for(int i=0;i<1000;i++){
            if(ans[i]>max){
                max=ans[i];
                result=i+1;
            }
        }
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        int key = 1;
        findfrequent(nums, key);

    }
}
