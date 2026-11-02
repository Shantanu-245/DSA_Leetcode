class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int prefix = 0;
        int total = 0;
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