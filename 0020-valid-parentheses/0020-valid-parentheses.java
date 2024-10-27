

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();

        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        boolean isValid = true;

        for(char c : s.toCharArray()){
            if(map.keySet().contains(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    isValid = false;
                    break;
                }

                if(c != map.get(stack.peek())){
                    isValid= false;
                    break;
                }

                stack.pop();
            }
        }

        if(!stack.isEmpty()){
            isValid = false;
        }

        return isValid;
    }
    
}