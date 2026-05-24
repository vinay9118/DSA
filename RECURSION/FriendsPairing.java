import java.util.*;

public class FriendsPairing{
    //NOT OPTIMISED METHOD 
    public static int FriendsP(int n){//  2 x n floor size
    if(n==1 || n==2){
        return n;
    }
    return FriendsP(n-1)+(n-1)*FriendsP(n-2);
    }

    //OPTIMIZED METHOD
    public static int Friends(int n, int[] dp) {
    if (n == 1 || n == 2) return n;
    if (dp[n] != -1) return dp[n];

    dp[n] = Friends(n - 1, dp) + (n - 1) * Friends(n - 2, dp);
    return dp[n];
}

    //main function
    public static void main(String [] args){
        System.out.println(FriendsP(4));

        //OPTIMIZED METHOD
        int []dp=new int[5];
        Arrays.fill(dp,-1);
        System.out.println(Friends(4,dp));
    }
}