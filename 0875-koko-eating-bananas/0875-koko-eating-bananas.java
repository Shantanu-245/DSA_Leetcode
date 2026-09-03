class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans = 0;
        int st = 1, ed = findMax(piles);
        while(st <= ed){
            int md = st + (ed - st) / 2;
            long minHour = totalHour(piles, md);
            if(minHour <= h){
                ans = md;
                ed = md - 1;
            }
            else{
                st = md + 1;
            }
        }
        return ans;
    }
    private static long totalHour(int[] nums, int hour){
        long res = 0;
        for(int i = 0; i < nums.length; i++){
            res += (long)Math.ceil((double)nums[i]/hour);
        }
        return res;
    }
    private static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int x : arr){
            max = Math.max(x,max);
        }
        return max;
    }
}