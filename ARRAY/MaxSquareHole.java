import java.util.*;

public class MaxSquareHole{

    public static int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int maxHGap = getMaxGap(hBars);
        int maxVGap = getMaxGap(vBars);

        int side = Math.min(maxHGap, maxVGap);
        return side * side;
    }

    private static int getMaxGap(int[] bars) {
        if (bars.length == 0) return 1;

        Arrays.sort(bars);
        int maxConsecutive = 1;
        int current = 1;

        for (int i = 1; i < bars.length; i++) {
            if (bars[i] == bars[i - 1] + 1) {
                current++;
            } else {
                current = 1;
            }
            maxConsecutive = Math.max(maxConsecutive, current);
        }

        return maxConsecutive + 1;
    }

    public static void main(String[] args) {
        
        int n = 2;
        int m = 2;

        int[] hBars = {2};
        int[] vBars = {2};

        int result = maximizeSquareHoleArea(n, m, hBars, vBars);
        System.out.println("Maximum square hole : " + result);
    }
}
