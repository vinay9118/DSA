import java.util.*;

public class SpiralMatrix{
    public static int [][] generateMatrix(int n){
        //create an array size of n*n
        int [][] arr=new int[n][n];
        
        int count=1;

        int minrow=0;
        int mincol=0;
        int maxrow=n-1;
        int maxcol=n-1;

        while(count <= n*n){

            //  minrow constant ,mincol->maxcol 
            for(int a=mincol;a<=maxcol;a++){
                arr[minrow][a]=count;
                count++;
            }
            for(int b=minrow+1;b<=maxrow;b++){
                arr[b][maxcol]=count;
                count++;
            }

            //maxrow constant ,maxcol-1  ->>mincol
            for(int a=maxcol-1;a>=mincol;a--){
                arr[maxrow][a]=count;
                count++;
            }

            //mincol constant, maxrow-1 ->>minrow+1
            for(int b=maxrow-1;b>=minrow+1;b--){
                arr[b][mincol]=count;
                count++;
            }
            //increase min++,and decrease max--
            minrow++;
            mincol++;
            maxrow--;
            maxcol--;
        }
        return arr;
    }
    public static void main(String[] args){

      int number=3;
      int[][]result=generateMatrix(number);

       for(int i=0;i<result.length;i++){
        for(int j=0;j<result[i].length;j++){
            System.out.print(result[i][j]+" ");
        }
        System.out.print(" ");
      }

    }
}