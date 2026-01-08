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
        String cust= "YYN";
        int result = bestClosingTime(cust);
        System.out.println("Customer " + cust);
        System.out.println("Best Closing : " + result);
    }
}
