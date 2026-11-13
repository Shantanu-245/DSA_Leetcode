class Solution {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;

        long[] prefix = new long[n];
        long[] suffix = new long[n];

        long minDiff = Long.MAX_VALUE;
        int ans = 0;

        prefix[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }
        suffix[n - 1] = nums[n - 1];
        
        for(int i = n - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] + nums[i];
        }
        for(int i = 0; i < n; i++){
            long leftavg = prefix[i] / (i + 1);

            long rightavg = 0;

            if(i != n - 1){
                rightavg = suffix[i + 1] / (n - i - 1);
            }

            long diff = Math.abs(leftavg - rightavg);

            if(diff < minDiff){
                minDiff = diff;
                ans = i;
            }
        }

        return ans;
    }
}