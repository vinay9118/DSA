import java.util.*;

public class shortestpath{
    public static double Shortestpath(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            int path=str.charAt(i);
            if(path=='N'){
                y++;
            }
            else if(path=='S'){
                y--;
            }
            else if(path=='W'){
                x--;
            }
            else if(path=='E'){
                x++;
            }
        }

        double ans=Math.sqrt(x*x+y*y);
        return ans;
    }
    public static void main(String [] args){
        String str1="WNEENESENNN";
        double result=Shortestpath(str1);
        System.out.println(result);
    }
}