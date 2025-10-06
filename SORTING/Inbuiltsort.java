import java.util.*;

public class Inbuiltsort{
    public static Integer [] inbuiltsort(Integer[] num){

        Arrays.sort(num,0,3);
         System.out.println("Sort array in range index Order"+Arrays.toString(num));

        Arrays.sort(num);//ascending order
        System.out.println("Sort array in ascending Order:"+Arrays.toString(num));

        Arrays.sort(num,Collections.reverseOrder());
        System.out.println("Sort array in descending Order:"+Arrays.toString(num));
        return num;
    }
    public static void main(String[] args){
        Integer arr[]={3,6,2,1,8,7,4,5,3};
        Integer[]result=inbuiltsort(arr);
        System.out.println(Arrays.toString(result));
    }
}