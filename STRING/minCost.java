class Solution {
    public int minCost(String colors, int[] neededTime) {
        int total = 0;
        int prevMax = neededTime[0];

        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) {
                total += Math.min(prevMax, neededTime[i]);
                prevMax = Math.max(prevMax, neededTime[i]);
            } else {
                prevMax = neededTime[i];
            }
        }

        return total;
    }

    public static void main(String[] args) {
        String colors = "aabaa";
        int[] neededTime = {1, 2, 3, 4, 1};
        Solution sol = new Solution();
        int result = sol.minCost(colors, neededTime);
        System.out.println("Minimum total cost to remove balloons: " + result);
    }
}
