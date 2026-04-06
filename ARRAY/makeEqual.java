
class makeEqual {

    public static boolean makeEqual(String[] words) {
        int[] f = new int[26];

        for (String w : words) {
            for (char ch : w.toCharArray()) {
                f[ch - 'a']++;
            }
        }

        for (int count : f) {
            if (count % words.length != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String[] words = {"abc", "aabc", "bc"};  // Input

        boolean result = makeEqual(words);
        System.out.println(result);
    }
}
