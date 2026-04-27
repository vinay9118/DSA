import java.util.*;

public class Roman {

    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int currValue = romanMap.get(c);

            if (currValue < prevValue) {
                total -= currValue;
            } else {
                total += currValue;
            }

            prevValue = currValue;
        }

        return total;
    }
    //main function
    public static void main(String[] args) {
        String s = "MCMXCIV"; // Example  (1994)

        Roman obj = new Roman();
        int result = obj.romanToInt(s);

        System.out.println("Roman numeral: " + s);
        System.out.println("Integer value: " + result);
    }
}
