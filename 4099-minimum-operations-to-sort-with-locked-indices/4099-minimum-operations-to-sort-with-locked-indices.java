class Solution {
    public int minOperations(int[] nums, int[] locked, int k) {
        int n = nums.length;

        int unlock = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            max = Math.max(max, nums[i]);

            if(locked[i] == 1){
                if(nums[i] != i + 1 || max > i + 1){
                    unlock++;
                }
            }
        }
        if(unlock > k) return -1;

        int swap = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] > nums[j]){
                    swap++;
                }
            }
        }

        return unlock + swap;
    }
}