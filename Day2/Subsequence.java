package Day2;
public class Subsequence{
    static class Solution {
        public boolean isSubsequence(String s, String t) {
            int sIndex = 0;
            int tIndex=0;
            int[] sArr = new int[s.length()];
            if(s.length() > t.length())
                return false;
            
            else{                
                while(sIndex < s.length() && tIndex<t.length()){
                    if(s.charAt(sIndex) == t.charAt(tIndex)){
                        sArr[sIndex] = 1;
                        tIndex += 1;
                        sIndex += 1;
                        
                    }
                    else
                    //System.out.println(tIndex);
                        tIndex += 1;
                }
            }
            for(int i=0; i<sArr.length; i++){
                if(sArr[i] == 0)
                    return false;
            }
            return true;
            // if(map.containsValue(false))
            //     return false;
            // else
            //     return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abc";
        String t = "adfbec";
        System.out.println(solution.isSubsequence(s, t));
    }
}