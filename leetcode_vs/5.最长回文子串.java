/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";
        for (int i = 0; i < n; i++) {
            int l = i - 1, r = i + 1;
            while(l>=0&&r<n&&s.charAt(l)==s.charAt(r)){
                l--;r++;
            }
            if(res.length()<r-l-1){
                res = s.substring(l+1, r);
            }
            l = i;
            r=i+1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            if (res.length() < r - l - 1) {
                res = s.substring(l + 1, r);
            }
        }
        return res;
    }
}
// @lc code=end

