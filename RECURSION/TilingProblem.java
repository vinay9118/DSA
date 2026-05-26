import java.util.*;

public class TilingProblem{
    //NOT OPTIMISED METHOD 
    public static int tilingproblem(int n){//  2 x n floor size
    if(n==0 || n==1){
        return 1;
    }
    // vertical choice
    int ver=tilingproblem(n-1);

    //Horizontal choice
    int hor=tilingproblem(n-2);
    int ways=ver+hor;
    return ways;

    }

 
    //main function
    public static void main(String [] args){
        System.out.println(tilingproblem(4));
    }
}