import java.util.*;
public class poweroftwo{
    public static boolean Poweroftwo(int n){
        if(n<1){
            return false;
        }
        else if(n==1){
            return true;
        }
        else{
            while(n%2==0){
                n=n/2;
            }
            if(n==1){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=sc.nextInt();
        boolean result=Poweroftwo(n);
        System.out.print(result); 
    }
}