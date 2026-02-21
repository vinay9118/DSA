// 1 2 3 4 5 -> -1 0 1 2 

public class A{
    public static void changeArr(int []arr,int i,int val){
        //base case
        if(i== arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }

    public static void printArr(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String [] args){
        int []arr=new int[5];// 1 2 3 4 5 -> -1 0 1 2 3
        changeArr(arr,0,1);
        printArr(arr);
    }
}