public class Bestclosing {

    // Function to find the best hour to close the shop
    public static int bestClosingTime(String customers) {

        // Initial penalty if the shop is closed at hour 0
        // Count all 'Y' because customers come when shop is closed
        int penalty = 0;
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                penalty++;
            }
        }

        // Minimum penalty found so far
        int minPenalty = penalty;

        // Best hour to close the shop
        int bestHour = 0;

        // Traverse each hour and update penalty dynamically
        for (int i = 0; i < customers.length(); i++) {

            // If customer comes at this hour and shop is open,
            // closing later avoids penalty → decrease penalty
            if (customers.charAt(i) == 'Y') {
                penalty--;
            } 
            // If no customer comes and shop is open,
            // keeping shop open adds penalty → increase penalty
            else {
                penalty++;
            }

            // Update minimum penalty and best hour
            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestHour = i + 1;
            }
        }

        // Return the earliest hour with minimum penalty
        return bestHour;
    }

    // Main function (basic input-output)
    public static void main(String[] args) {

        // Input string representing customer visits
        String cust = "YYN";

        // Call function
        int result = bestClosingTime(cust);

        // Output result
        System.out.println("Customer Log: " + cust);
        System.out.println("Best Closing Hour: " + result);
    }
}
