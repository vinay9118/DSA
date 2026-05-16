import java.util.*;
public class MixedOddAlphabetPyramid{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int n=sc.nextInt();
        for( int i=1;i<=n;i++){
            int a=65;
            int b=1;
            if(i%2!=0)
            {
                for(int j=1;j<=i;j++){
                System.out.print(b);
                b=b+2;}
            }
            else{
                    for(int j=1;j<=i;j++){
                    System.out.print((char)a);
                    a=a+1;}
            }
             System.out.println(" ");
        }
        
    }
}