package codingtests.romantointeger;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    Map<Character, Integer> converterMap = new HashMap<Character, Integer>() {{
        put('M', 1000);
        put('D', 500);
        put('C', 100);
        put('L', 50);
        put('X', 10);
        put('V', 5);
        put('I', 1);
    }};

    public int convertRomanToInteger(String romanNr) {
        Integer value = 0;
        for (int i = 0; i < romanNr.length(); i++) {
            int current = converterMap.get(romanNr.charAt(i));
            value += (i < romanNr.length()-1 && current < converterMap.get(romanNr.charAt(i+1)))? -current:current;
        }
        return value;
    }
}
