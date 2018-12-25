class Solution {
    public String convert(String s, int numRows) {
        int[] keys = new int[s.length()];
        String[] split = s.split("");
        if (numRows == 1) return s;
        int mark = 0;
        for (int row = 0; row < numRows; row++){
            if (row == 0 || row == numRows - 1){
                for (int i = row; i < keys.length; i += 2 * (numRows-1)){
                    keys[mark] = i;
                    mark += 1;
                }
            }
            else{
                int add = 0;
                int label = row;
                while (label < keys.length){
                    keys[mark] = label;
                    mark += 1;
                    if (add == 0){
                        label += 2 * (numRows - row - 1);
                        add = 1;
                    }
                    else {
                        label += 2 * row;
                        add = 0;
                    }
                }
            }
        } 
        String ret = "";
        for (int i: keys){
            ret += split[i];
        }
        return ret;
    }
}