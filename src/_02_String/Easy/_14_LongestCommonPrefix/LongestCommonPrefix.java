package _02_String.Easy._14_LongestCommonPrefix;

public class LongestCommonPrefix {
    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs.length == 0) return "";
            String lc_prefix = strs[0];
            for (int i = 1; i < strs.length; i++){
                while (strs[i].indexOf(lc_prefix) != 0) {
                    lc_prefix = lc_prefix.substring(0, lc_prefix.length() - 1);
                    if (lc_prefix.isEmpty()) return "";
                }
            }
            return lc_prefix;
        }
    }
}
