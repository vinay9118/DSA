
import java.util.*;
//num=[1,2,0,0] ,k=34
// OUTPUT=[1,2,3,4]
public class AddToArrayInt{
    public static List<Integer> addToArrayForm(int[] num,int k){
        List<Integer> ans= new ArrayList<>();
        int p=num.length-1;
        int carry=0;
        while(p >= 0 || k > 0){
            int numval=0;

            if(p>=0){
                numval=num[p];
            }
            //find the last digit digit from k
            int d=k%10;

            int sum=numval+d+carry;

            int digit= sum%10;

            carry=sum/10;
            ans.add(digit);
            
            p--;
            k=k/10;
        }
        if(carry>0){
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
    }
    //using basic array
    public static int[] addtoarrayform(int[] num, int k) {
        int n = num.length;
        int[] temp = new int[n + 10];  // Temporary array with safe extra space
        int index = 0;
        int carry = 0;
        int i = n - 1;

        while (i >= 0 || k > 0 || carry > 0) {
            int digitFromNum = (i >= 0) ? num[i] : 0;
            int digitFromK = k % 10;

            int sum = digitFromNum + digitFromK + carry;
            temp[index++] = sum % 10;
            carry = sum / 10;

            i--;
            k /= 10;
        }

       //reverse the array
        int[] result = new int[index];
        for (int j = 0; j < index; j++) {
            result[j] = temp[index - j - 1];
        }
        

        return result;
    }



    public static void main(String[] args){
        int [] arr={1,2,0,0};
        int n=34;
        List<Integer> result1=addToArrayForm(arr,n);
        System.out.println((result1));

        int [] result=addtoarrayform(arr,n);
        System.out.println(Arrays.toString(result));

    }
}
