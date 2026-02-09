
public class MaxMatrixSum {

    public static long maxMatrixSum(int[][] matrix) {
        long totalSum = 0;
        int negativeCount = 0;
        int minAbs = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int val = matrix[i][j];
                totalSum += Math.abs(val);

                if (val < 0) {
                    negativeCount++;
                }

                minAbs = Math.min(minAbs, Math.abs(val));
            }
        }

        if (negativeCount % 2 == 1) {
            totalSum -= 2L * minAbs;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, -1},
            {-1, 1}
        };
        long result = maxMatrixSum(matrix);
        System.out.println("Max Matrix Sum: " + result);
    }
}
