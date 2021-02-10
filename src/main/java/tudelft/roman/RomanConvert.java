package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanConvert {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int convert(String romanNumber) {

        int convertedNumber = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            int currentNumber = map.get(romanNumber.charAt(i));
            int nextNumber;
            if (i+1 == romanNumber.length()) {
                nextNumber = 0;
            }
            else {
                nextNumber = map.get(romanNumber.charAt(i+1));
            }

            if(currentNumber<nextNumber) {
                convertedNumber -= currentNumber;
            }
            else {
                convertedNumber += currentNumber;
            }
        }

        return convertedNumber;
    }
}
