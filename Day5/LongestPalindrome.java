package Day5;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    static class Solution {
        public int longestPalindrome(String s) {
            
            HashMap<Character,Integer> map = new HashMap<>();
            int odd = 0 ;
        
            int n = s.length();
            for(int i =0;i <n;i++){
                if(map.get(s.charAt(i))!=null)
                    map.put(s.charAt(i), map.get(s.charAt(i))+1);
                else
                    map.put(s.charAt(i), 1);
            }

            for(Map.Entry<Character, Integer> entry: map.entrySet()){
                if(entry.getValue() %2 !=0)
                    odd++;
            }

            if(odd >=1)
                return (n-odd) +1;
            
            return n;
        }
            
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String string = "adam";
        System.out.println(solution.longestPalindrome(string));
    }
    
    
}
