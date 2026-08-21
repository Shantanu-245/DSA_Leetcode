class Solution {
    public int search(int[] nums, int target) {
        return BS(nums,0,nums.length - 1,target);
    }
    static int BS(int[] arr, int st, int ed, int target){
        while(st <= ed){
            int md = st + (ed - st) / 2;
            if(arr[md] == target){
                return md;
            }
            if(arr[st] <= arr[md]){
                if(arr[st] <= target && target < arr[md]){
                    ed = md - 1;
                }
                else{
                    st = md + 1;
                }
            }
            else{
                if(arr[md] < target && target <= arr[ed]){
                    st = md + 1;
                }
                else{
                    ed = md - 1;
                }
            }
        }
        return -1;
    }
}