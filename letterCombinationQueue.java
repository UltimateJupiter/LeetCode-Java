import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) return new LinkedList<String>();
        HashMap<String, List<String>> info = new HashMap<>();
        char c = 'a';
        for (int i = 2; i < 10; i++){
            
            if (i != 9 && i != 7){
                List<String> inList = new ArrayList<>();
                for (int j = 0; j < 3; j++){
                    inList.add(Character.toString(c));
                    c++;
                }
                info.put(Integer.toString(i), inList);
            }
            else{
                List<String> inList = new ArrayList<>();
                for (int j = 0; j < 4; j++){
                    inList.add(Character.toString(c));
                    c++;
                }
                info.put(Integer.toString(i), inList);
            }
        }
        LinkedList<String> ret = new LinkedList<String>();
        ret.add("");
        while(ret.peek().length() < digits.length()){
            String tmp = ret.remove();
            for (String s: info.get(digits.substring(tmp.length(), tmp.length() + 1))){
                ret.add(tmp + s);
            }
        }
        return ret;
    }
}