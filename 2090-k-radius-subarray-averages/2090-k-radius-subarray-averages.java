class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        int size = 2 * k + 1;

        if(size > n){
            return ans;
        }

        long[] prefix = new long[n + 1];

        for(int i = 0; i < n; i++){
            prefix[i + 1] = prefix[i] + nums[i];
        }

        for(int i = k; i < n - k; i++){
            int l = i - k;
            int r = i + k;

            long sum = prefix[r + 1] - prefix[l];

            ans[i] = (int)(sum / size);
        }

        return ans;
    }
}