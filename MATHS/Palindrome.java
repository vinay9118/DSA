public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;            
        if (x >= 0 && x < 10) return true;  
        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }
        while (x > 0) {
            int left = x / div;   
            int right = x % 10;  
            if (left != right) return false;
            // Remove leftmost and rightmost digits
            x = (x % div) / 10;  
            div /= 100; 
        }

        return true;
    }

    public static void main(String[] args) {
        int x = 121;

        boolean result = isPalindrome(x);
        System.out.println("Input number: " + x);
        System.out.println("Is palindrome? " + result);
    }
}


