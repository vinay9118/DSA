public class Bestclosing{

    public static int bestClosingTime(String customers) {
        int penalty = 0;
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                penalty++;
            }
        }

        int minPenalty = penalty;
        int bestHour = 0;

        // Check penalty for closing at each hour
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                penalty--;   // shop open, customer comes → reduce penalty
            } else {
                penalty++;   // shop open, no customer → increase penalty
            }

            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestHour = i + 1;
            }
        }

        return bestHour;
    }

    public static void main(String[] args) {
        // Input already defined
        String customers = "YYNY";

        int result = bestClosingTime(customers);

        System.out.println("Customer Log: " + customers);
        System.out.println("Best Closing Hour: " + result);
    }
}
