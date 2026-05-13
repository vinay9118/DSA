import java.util.*;
public class AlphabetPyramid{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int n=sc.nextInt();
        for( int i=1;i<=n;i++){
            int a=65;
            for(int j=1;j<=i;j++){
                System.out.print((char)a);
                a=a+1;
            }
             System.out.println(" ");
        }
        
    }
}