
public class Subsets_Of_String {

    public static void findSubsetStr(String str, String ans, int i) {
        int n = str.length();
        if (n == i) {
            if (ans.length() == 0) {
                System.out.print(""+"null");
            } else {
                System.out.print(ans+" ");
            }

            return;
        }
        //yes choice
        findSubsetStr(str, ans + str.charAt(i), i + 1);
        //No choice
        findSubsetStr(str, ans, i + 1);

    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        findSubsetStr(str, ans, 0);
    }
}
