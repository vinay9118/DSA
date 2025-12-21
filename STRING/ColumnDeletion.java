
public class ColumnDeletion {

    public static int minDeletionSize(String[] strs) {
        int rows = strs.length;
        int cols = strs[0].length();
        int count = 0;

        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows - 1; r++) {
                if (strs[r].charAt(c) > strs[r + 1].charAt(c)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] strs = {"abc", "bce", "cae"};
        int result = minDeletionSize(strs);
        System.out.println("Number of columns to delete: " + result);
    }
}
