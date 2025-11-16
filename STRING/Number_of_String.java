public class Number_of_String {

    public static int numSub(String s) {
        final int MOD = 1_000_000_007;
        long ans = 0;
        long len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                len++;
                ans += len;
            } else {
                len = 0;
            }
            if (ans >= MOD) ans %= MOD;
        }

        return (int)(ans % MOD);
    }

    public static void main(String[] args) {
        String s = "111111";   // direct input string
        System.out.println(numSub(s));
    }
}
