import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(String digits) {
        Map<String, List<String>> info = new HashMap<>();
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
        List<String> ret = new ArrayList<>();
        ret.add("");
        for (String s: digits.split("")){
            if (s.equals("")) return new ArrayList<String>();
            List<String> tmp = new ArrayList<>();
            for (String base: ret){
                for (String t: info.get(s)){
                    tmp.add(base + t);
                }
            }
            ret = tmp;
        }
        return ret;
    }
}