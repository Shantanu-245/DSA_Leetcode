class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = 0;
        for(int x : nums){
            max = Math.max(max,x);
        }
        int st = 1, ed = max;
        int res = -1;
        while(st <= ed){
            int md = st + (ed - st) / 2;
            int sum = 0;
            for(int n : nums){
                sum += (int)Math.ceil((double)n / md);
            }
            if(sum <= threshold){
                res = md;
                ed = md - 1;
            }
            else{
                st = md + 1;
            }
        }
        return res;
    }
}