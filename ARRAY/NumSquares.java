public class NumSquares {
    // DP solution: dp[i] = least number of perfect squares
    public int numSquares(int n) {
        if (n <= 0) return 0;
        int[] dp = new int[n + 1];
        // initialize with "infinity" (larger than any possible answer)
        for (int i = 1; i <= n; i++) dp[i] = Integer.MAX_VALUE;

        // precompute squares up to n
        int maxRoot = (int) Math.sqrt(n);
        int[] squares = new int[maxRoot];
        for (int i = 1; i <= maxRoot; i++) squares[i - 1] = i * i;

        // DP build
        for (int i = 1; i <= n; i++) {
            for (int sq : squares) {
                if (sq > i) break;
                dp[i] = Math.min(dp[i], dp[i - sq] + 1);
            }
        }
        return dp[n];
    }

    // Runnable example (no Scanner): change `n` below to test other values
    public static void main(String[] args) {
        int n = 12; // example: 12 -> 3 (4 + 4 + 4)
        NumSquares solver = new NumSquares();
        int result = solver.numSquares(n);
        System.out.println("n = " + n + " -> least number of perfect squares = " + result);
    }
}
