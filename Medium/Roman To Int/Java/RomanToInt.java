import java.util.Map;
import java.util.HashMap;

public class RomanToInt {
    private static Map<Character, Integer> numerals = new HashMap<>();
    static {
        numerals.put('I', 1);
        numerals.put('V', 5);
        numerals.put('X', 10);
        numerals.put('L', 50);
        numerals.put('C', 100);
        numerals.put('D', 500);
        numerals.put('M', 1000);
    }
    public static void main(String[] args) throws Exception {
        System.out.println(romanToInt("MMCDXCIV"));
    }
    public static int romanToInt(String roman) {
        int total = 0;
        for (int i = 0; i < roman.length(); i++) {
            char numeral = roman.charAt(i);
            if (i != 0) {
                char prev_numeral = roman.charAt(i - 1);
                if (numerals.get(numeral) > numerals.get(prev_numeral)) {
                    total -= numerals.get(prev_numeral) * 2;
                }
            }
            total += numerals.get(numeral);
        }
        return total;
    }
}
