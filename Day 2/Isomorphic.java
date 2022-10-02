import java.util.HashMap;

public class Isomorphic {
    static class Solution {
        public boolean isIsomorphic(String s, String t) {
            HashMap<Character, Character> mapping = new HashMap<Character, Character>();
            HashMap<Character, Boolean> mappedBefore = new HashMap<Character, Boolean>();
            Boolean equivalent = true;

            for (int i = 0; i < s.length(); i++) {
                if (mapping.containsKey(s.charAt(i))) {
                    char mapped = mapping.get(s.charAt(i));

                    if (mapped != t.charAt(i)) {
                        equivalent = false;
                        break;
                    }
                }

                else {
                    if (mappedBefore.containsKey(t.charAt(i))) {
                        equivalent = false;
                        break;
                    } else {
                        mappedBefore.put(t.charAt(i), true);
                        mapping.put(s.charAt(i), t.charAt(i));
                    }

                }
            }
            return equivalent;

        }
    }
        public static void main(String[] args) {
            Solution solution = new Solution();
            String s = "badc"; // p = t; a = i; p = t; e = l; r = e || b=b; a=a; d=b; c=a
            String t = "baba";
            System.out.println(solution.isIsomorphic(t, s));
        }
    
}