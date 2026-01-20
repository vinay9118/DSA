public class SeparateSquares{

    public static double separateSquares(int[][] squares) {
        double low = Double.MAX_VALUE;
        double high = Double.MIN_VALUE;
        for (int[] s : squares) {
            low = Math.min(low, s[1]);
            high = Math.max(high, s[1] + s[2]);
        }
        for (int iter = 0; iter < 100; iter++) { 
            double mid = (low + high) / 2.0;

            double below = 0.0;
            double above = 0.0;

            for (int[] s : squares) {
                double bottom = s[1];
                double top = s[1] + s[2];
                double side = s[2];
                double area = side * side;

                if (top <= mid) {
                    below += area;
                } else if (bottom >= mid) {
                    above += area;
                } else {
                    below += side * (mid - bottom);
                    above += side * (top - mid);
                }
            }

            if (below < above) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        // Input already defined
        int[][] squares = {
            {0, 0, 2},
            {1, 1, 2}
        };

        double result = separateSquares(squares);

        // Output
        System.out.printf("Minimum y-coordinate: %.5f%n", result);
    }
}
