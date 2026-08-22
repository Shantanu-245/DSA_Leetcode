class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int firstoccure = fobs(nums,target);
        int lastoccure = lobs(nums,target);
        res[0] = firstoccure;
        res[1] = lastoccure;

        return res;
    }
    private int fobs(int[] nums, int tar){
        int st = 0;
        int ed = nums.length - 1;
        int res = -1;
        while(st <= ed){
            int md = st + (ed - st) / 2;
            if(nums[md] == tar){
                res = md;
                ed = md - 1;
            }
            else if(nums[md] < tar) st = md + 1;
            else ed = md - 1;
        }
        if(res == -1){
            return res;
        }
        return res;
    }
    private int lobs(int[] nums, int tar){
        int st = 0;
        int ed = nums.length - 1;
        int res = -1;
        while(st <= ed){
            int md = st + (ed - st) / 2;
            if(nums[md] == tar){
                res = md;
                st = md + 1;
            }
            else if(nums[md] < tar) st = md + 1;
            else ed = md - 1;
        }
        if(res == -1){
            return res;
        }
        return res;
    }
}