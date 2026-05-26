import java.util.*;

public class TowerOfHanoi{
    public static void towerOfHanoi(int n,String source,String helper,String Dest){
        if(n==1){
            System.out.println("transfer disk"+n+"from"+source+"to"+Dest);
            return;
        }
        towerOfHanoi(n-1,source,Dest,helper);
        System.out.println("transfer disk"+n+"from"+source+"to"+Dest);
        towerOfHanoi(n-1,helper,source,Dest);
    }
    public static void main(String[] args){
        int n=3;
        towerOfHanoi(n,"S","H","D");
    }
}