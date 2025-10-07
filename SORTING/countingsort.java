import java.util.*;

public class countingsort{
    public static int [] Countingsort(int[] num){
        
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            largest=Math.max(largest,num[i]); //find largest number 
        }
        int []count=new int[largest+1]; //create new count array which size is largest+1
        // count frequency
        for(int i=0;i<num.length;i++){
            count[num[i]]++;
        }

        //sorting on count array
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i] >0){
                num[j]=i;
                j++;
                count[i]--;
            }
        }
        return num;
        
    }
         public static void main(String[] args){
        int arr[]={3,6,2,1,8,0};
        int[]result=Countingsort(arr);
        System.out.println(Arrays.toString(result));

        
    }
}