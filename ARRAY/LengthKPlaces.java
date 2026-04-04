public class LengthKPlaces{

    // Method
    public boolean kLengthApart(int[] nums, int k) {
        int ans = -1;    
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (ans != -1) {             
                    if (i - ans - 1 < k) {  
                        return false;
                    }
                }
                ans = i; 
            }
        }
        return true;
    }

    // Main function with predefined input
    public static void main(String[] args) {

        // 🔹 Initialized input
        int[] nums = {1, 0, 0, 0, 1, 0, 0, 1};
        int k = 2;

        // Create object
        LengthKPlaces obj = new LengthKPlaces();

        // Call function
        boolean result = obj.kLengthApart(nums, k);

        //Output
        System.out.println("Result: " + result);
    }
}
