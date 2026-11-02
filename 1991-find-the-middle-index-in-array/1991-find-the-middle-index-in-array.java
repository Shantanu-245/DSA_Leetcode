class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int total = 0;
        int prefix = 0;
        for(int i : nums){
            total += i;
        }
        for(int i = 0; i < n; i++){
            int suffix = total - prefix - nums[i];
            if(prefix == suffix) return i;
            prefix += nums[i];
        }

        return -1;
    }
}