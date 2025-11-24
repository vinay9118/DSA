
public class Length_of_last_word {

    public static int lengthOfLastWord(String s) {
        int countnumber = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                countnumber++;
            } else if (countnumber != 0) {
                break;
            }
        }
        return countnumber;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }
}
