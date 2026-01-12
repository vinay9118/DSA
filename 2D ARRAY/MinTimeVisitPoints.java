public class MinTimeVisitPoints{

    public static int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;

        for (int i = 1; i < points.length; i++) {
            int dx = Math.abs(points[i][0] - points[i - 1][0]);
            int dy = Math.abs(points[i][1] - points[i - 1][1]);

            time += Math.max(dx, dy);
        }

        return time;
    }

    public static void main(String[] args) {
        // Input already defined
        int[][] points = {
            {1, 1},
            {3, 4},
            {-1, 0}
        };

        int result = minTimeToVisitAllPoints(points);

        // Output
        System.out.println("Minimum time to visit all points: " + result);
    }
}
