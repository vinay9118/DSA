import java.util.*;

public class Rotateimage{

    public static void rotate(int [][]matrix){
        int n= matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int k=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=k;
            }
        }
        for(int i=0;i<matrix.length;i++){
            int[] temparr=matrix[i];
            reverse(temparr);
        }  
    }
     private static void reverse(int [] arr){
            int start=0;
            int end=arr.length-1;

            while(start<=end){
                int k=arr[start];
                arr[start]=arr[end];
                arr[end]=k;
                start++;
                end--;
            }
        }
    public static void main(String[] args){
        //Input
        int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
         for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}