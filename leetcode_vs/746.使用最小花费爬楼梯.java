import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=746 lang=java
 *
 * [746] 使用最小花费爬楼梯
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n < 3) {
            return Math.min(cost[0], cost[1]);
        }
        int[] dp = new int[n];
        dp[0]   = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        
        return Math.min(dp[n - 1],dp[n-2]);
    }
}
// @lc code=end

