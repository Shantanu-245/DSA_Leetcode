class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[n - 1] != nums[n - 2]) return nums[n - 1];

        int st = 1, ed = n - 2;
        while(st <= ed){
            int md = st + (ed - st) / 2;
            if(nums[md] != nums[md + 1] && nums[md] != nums[md - 1]){
                return nums[md];
            }
            if((md % 2 == 0 && nums[md] == nums[md + 1]) || (md % 2 == 1 && nums[md] == nums[md - 1])){
                st = md + 1;
            }
            else{
                ed = md - 1;
            }
        }
        return -1;
    }
}