

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String input) {
        Map<String, Integer> romanValues = new HashMap<>();
        romanValues.put("M", 1000);
        romanValues.put("CM", 900);
        romanValues.put("D", 500);
        romanValues.put("CD", 400);
        romanValues.put("C", 100);
        romanValues.put("XC", 90);
        romanValues.put("L", 50);
        romanValues.put("XL", 40);
        romanValues.put("X", 10);
        romanValues.put("IX", 9);
        romanValues.put("V", 5);
        romanValues.put("IV", 4);
        romanValues.put("I", 1);

        int number = 0;
        int i = 0;


        while(i<input.length()){
            if(i + 1 < input.length()  && romanValues.containsKey(input.substring(i,i+2)) ){
                number += romanValues.get(input.substring(i, i+2));
                i += 2;
            }else if(romanValues.containsKey(input.substring(i, i+1))){
                number += romanValues.get(input.substring(i, i+1));
                i += 1;
            }
        }

        return number;
    }
    
}