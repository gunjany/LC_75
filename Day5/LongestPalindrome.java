package Day5;

public class LongestPalindrome {
    static class Solution {
        public int longestPalindrome(String s) {
        int [] ch = new int[256];
        int odd = 0 ;
        
        int n = s.length();
        for(int i =0;i <n;i++){
            ch[s.charAt(i)] += 1;
        }
        
        for(int i =0;i <256;i++){
            if(ch[i] % 2 != 0){
                odd++;
            }
        }
        if(odd >=1)
            return (n-odd) +1;
        
        return n;
        }
            
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String string = "abccccdd";
        System.out.println(solution.longestPalindrome(string));
    }
    
    
}
