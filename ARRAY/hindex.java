public class hindex {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] counts = new int[n + 1];

        for (int c : citations) {
            if (c >= n) counts[n]++;
            else counts[c]++;
        }

        int papersSoFar = 0;
        for (int h = n; h >= 0; h--) {
            papersSoFar += counts[h];
            if (papersSoFar >= h) return h;
        }
        return 0;
    }

    public static void main(String[] args) {
        // input
        int[] citations = {3, 0, 6, 1, 5};

        // Create an object of hindex class
        hindex obj = new hindex();

        // Call hIndex() using the object
        int result = obj.hIndex(citations);

        // Print the result
        System.out.println("H-Index: " + result);
    }
}
