import java.util.*;

public class DiagonalSum{

    public static int diagonalsum(int [][]num){
        int n=num.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<num[0].length;j++){
                if(i==j ||i+j==n){
                    sum+=num[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int [][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalsum(arr));
    }
}