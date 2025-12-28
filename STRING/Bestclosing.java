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
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y') {
                penalty--;
            } else {
                penalty++;
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
        String customers = "YYN";

        int result = bestClosingTime(customers);

        System.out.println("Customer Log: " + customers);
        System.out.println("Best Closing Hour: " + result);
    }
}
