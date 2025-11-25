public class Palindrome{
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = x;
        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return rev == x;
    }

    public static void main(String[] args) {
        // Example input (you can change it)
        int x = 121;

        // Call the function and print output
        boolean result = isPalindrome(x);
        System.out.println("Input number: " + x);
        System.out.println("Is palindrome? " + result);
    }
}
