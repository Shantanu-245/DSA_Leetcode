class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int st = 0, ed = n - 1;
        while(st <= ed){
            int md = st + (ed - st) / 2;
            if(nums[md] == target){
                return md;
            }
            else if(nums[md] < target){
                st = md + 1;
            }
            else{
                ed = md - 1;
            }
        }
        return -1;
    }
}