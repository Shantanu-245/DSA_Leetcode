class Solution {
    public int splitArray(int[] nums, int k) {
        int st = Integer.MIN_VALUE;
        int ed = 0;
        for(int num : nums){
            st = Math.max(num, st);
            ed += num;
        }
        while(st < ed){
            int md = st + (ed - st) / 2;
            int part = 1;
            int sum = 0;
            for(int num : nums){
                if(sum + num > md){
                    part++;
                    sum = num;
                }
                else{
                    sum += num;
                }
            }
            if(part <= k){

                ed = md;
            }
            else{
                st = md + 1;
            }
        }
        return st;
    }
}