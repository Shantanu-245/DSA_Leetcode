class Solution {
    public long maxDifference(int[] nums) {
       int n = nums.length;
        int[] marr = nums;

        long[] dp = new long[n + 2];
        for(int i = n - 1; i >= 0; i--){
            long x = marr[i];
            long best = (x % 3 == 0) ? x - dp[i + 1] : x + dp[i + 1];
            if(i + 1 < n){
                long s = x + marr[i + 1];
                long take2 = (s % 3 == 0) ? s - dp[i + 2] : s + dp[i + 2];
                best = Math.max(best, take2);
            }
            dp[i] = best;
        }

        return dp[0];
    }
}