class Solution {
    public int searchInsert(int[] nums, int target) {
        int st = 0;
        int ed = nums.length - 1;
        while(st <= ed){
            int md = (st + ed) / 2;
            if(nums[md] == target) return md;
            else if(nums[md] > target) ed = md - 1;
            else st = md + 1;
        }
        return st;
    }
}