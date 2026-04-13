public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) return;
        k = k % n;  // normalize k
        if (k == 0) return;

        // reverse whole array
        reverse(nums, 0, n - 1);
        // reverse first k element
        reverse(nums, 0, k - 1);
        // reverse remaining n - k element
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] a, int i, int j) {
        while (i < j) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        // Rotate the array
        rotate(nums, k);

        // Output the result
        System.out.print("Rotated Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
