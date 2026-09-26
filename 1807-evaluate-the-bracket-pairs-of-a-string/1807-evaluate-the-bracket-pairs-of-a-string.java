import java.util.*;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < knowledge.size(); i++) {
            String key = knowledge.get(i).get(0);
            String value = knowledge.get(i).get(1);

            map.put(key, value);
        }

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) != '(') {
                ans.append(s.charAt(i));
                i++;
            }

            
            else {
                i++; 

                StringBuilder key = new StringBuilder();

                
                while (s.charAt(i) != ')') {
                    key.append(s.charAt(i));
                    i++;
                }

                i++;

                if (map.containsKey(key.toString())) {
                    ans.append(map.get(key.toString()));
                } else {
                    ans.append("?");
                }
            }
        }

        return ans.toString();
    }
}