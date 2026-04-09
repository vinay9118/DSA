

public class median {

    public static void main(String[] args) {
        //Input
        int[] num = {1, 2};
        int[] nums = {3, 4};
        int[] ans = merge(num, nums);
        if (ans.length % 2 == 0) {
            double an = (double) (ans[ans.length / 2] + ans[ans.length / 2 - 1]) / 2;
            System.out.println(an);
        } else {
            double an = (double) (ans[ans.length / 2]);
            System.out.println(an);
        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length + arr2.length];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        while (p1 < arr1.length || p2 < arr2.length) {
            int val1 = p1 < arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int val2 = p2 < arr2.length ? arr2[p2] : Integer.MAX_VALUE;
            if (val1 < val2) {
                ans[p3] = val1;
                p1++;
            } else {
                ans[p3] = val2;
                p2++;
            }
            p3++;
        }

        return ans;
    }

}
