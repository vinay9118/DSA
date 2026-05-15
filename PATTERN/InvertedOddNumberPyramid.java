import java.util.*;
public class InvertedOddNumberPyramid{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int n=sc.nextInt();
        for( int i=1;i<=n;i++){
            int a=1;
            for(int j=1;j<=n+1-i;j++){
                System.out.print(a);
                a=a+2;
            }
             System.out.println(" ");
        }
        
    }
}