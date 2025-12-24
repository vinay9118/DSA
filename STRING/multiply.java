class Solution {
    public String multiply(String num1, String num2) {
        // If either number is "0", the product is "0"
        if (num1.equals("0") || num2.equals("0")) return "0";

        int m = num1.length(), n = num2.length();
        int[] res = new int[m + n];

        // Multiply each digit from right to left
        for (int i = m - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';
            for (int j = n - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';

                int sum = d1 * d2 + res[i + j + 1]; 
                res[i + j + 1] = sum % 10;          
                res[i + j] += sum / 10;             
            }
        }

        // Convert array to string (skip leading zeros)
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < res.length && res[i] == 0) i++;
        for (; i < res.length; i++) sb.append(res[i]);

        return sb.toString();
    }

    // Example use
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.multiply("123", "45"));   // 5535
    }
}
