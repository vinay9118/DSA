
public class OneBitCharacter {

    public static boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        int n = bits.length;

        while (i < n - 1) {
            if (bits[i] == 1) {
                i += 2;      // two-bit character
            } else {
                i++;         // one-bit character
            }
        }
        return i == n - 1;
    }

    public static void main(String[] args) {

        int[] bits = {1, 0, 0};   // ← Input already defined

        // Call function
        boolean result = isOneBitCharacter(bits);

        // Print output
        System.out.println(result);
    }
}
