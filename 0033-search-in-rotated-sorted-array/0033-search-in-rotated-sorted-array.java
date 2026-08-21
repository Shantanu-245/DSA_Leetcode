class Solution {
    public int search(int[] nums, int target) {
        int st = bs(nums,0,nums.length - 1);
        int ed = nums.length - 1;
        int ans = search(nums, 0,st - 1,target); // left half
        if(ans == -1){
            ans = search(nums, st, ed,target); // right half
        }
        return ans;
    }
    static int bs(int[] arr,int st, int ed){
        while(st < ed){
            int md = (st + ed) /2;
            if(arr[md] > arr[ed]){
                st = md + 1;
            }
            else{
                ed = md;
            }
        }
        return st;
    }
    static int search(int[] arr,int st, int ed,int target){
        while(st <= ed){
            int md = (st + ed) / 2;
            if(arr[md] == target){
                return md;
            }
            if(arr[md] > target){
                ed = md - 1;
            }
            else{
                st = md + 1;
            }
        }
        return -1;
    }
}