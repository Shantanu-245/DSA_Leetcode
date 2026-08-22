class Solution {
    public boolean search(int[] nums, int target) {
        return BS(nums,0,nums.length - 1,target);
    }
    static boolean BS(int[] nums, int st, int ed, int target){
         while(st <= ed){
            int md = st + (ed - st)/2;
            if(nums[md] == target){
                return true;
            }
            if(nums[st] == nums[md] && nums[md] == nums[ed]){
                st++;
                ed--;
            }
            else if(nums[st] <= nums[md]){
                if(nums[st] <= target && target < nums[md]){
                    ed = md - 1;
                }
                else{
                    st = md + 1;
                }
            }
            else{
                if(nums[ed] >= target && target > nums[md]){
                    st = md + 1;
                }
                else{
                    ed = md - 1;
                }
            }
        }
        return false;
    }
}