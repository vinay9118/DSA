public class Sort_String {

    // sort arr[si..ei] (inclusive) and return a NEW sorted array
    public static String[] sort(String[] arr, int si, int ei) {
        if (si > ei) {
            return new String[0];            // empty segment
        }
        if (si == ei) {
            return new String[] { arr[si] };// single element
        }

        int mid = si + (ei - si) / 2;

        // FIX: left half is si..mid, right half is mid+1..ei
        String[] left = sort(arr, si, mid);
        String[] right = sort(arr, mid + 1, ei);

        return merging(left, right);
    }

    // merge two sorted arrays into a new sorted array
    public static String[] merging(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String[m + n];

        int idx = 0;
        int i = 0;
        int j = 0;

        // FIX: compare arr1[i] with arr2[j] (not arr2[i])
        while (i < m && j < n) {
            if (isAlphabeticallySmaller(arr1[i], arr2[j])) {
                // FIX: assign from arr1[i] (not arr3[i])
                arr3[idx++] = arr1[i++];
            } else {
                arr3[idx++] = arr2[j++];
            }
        }

        // copy remaining elements (FIX: copy from arr1 / arr2, not arr3)
        while (i < m) {
            arr3[idx++] = arr1[i++];
        }
        while (j < n) {
            arr3[idx++] = arr2[j++];
        }
        return arr3;
    }

    // lexicographic compare (case-sensitive). Return true if str1 < str2.
    public static boolean isAlphabeticallySmaller(String str1, String str2) {
        return str1.compareTo(str2) < 0;
    }

    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };
        // FIX: pass last index (arr.length - 1), not arr.length
        String[] result = sort(arr, 0, arr.length - 1);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
