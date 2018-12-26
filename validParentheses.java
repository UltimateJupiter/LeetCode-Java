import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack();
        for (char c: s.toCharArray()){
            if (stack.isEmpty()) {
                if (map.containsKey(c)) stack.push(c);
                else return false;
            }
            else {
                if (map.containsKey(c)) stack.push(c);
                else if (map.get(stack.pop()) == c) continue;
                else return false;
            }
        }
        return stack.isEmpty();
    }
}