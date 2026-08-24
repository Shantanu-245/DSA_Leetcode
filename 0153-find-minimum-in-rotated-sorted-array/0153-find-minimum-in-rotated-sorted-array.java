class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int st = 0, ed = n - 1;
        int ans = Integer.MAX_VALUE;
        while(st <= ed){
            int md = st + (ed - st) / 2;
            
            // if(nums[st] <= nums[ed]){
            //     ans = Math.min(ans, nums[st]);
            //     break;
            // }
            if(nums[st] <= nums[md]){
                ans = Math.min(ans, nums[st]);
                st = md + 1;
            }
            else{
                ans = Math.min(ans, nums[md]);
                ed = md - 1;
            }
        }
        return ans;
    }
}