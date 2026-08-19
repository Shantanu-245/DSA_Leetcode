class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int px = 0, nx = 1;
        for(int x : nums){
            if(x > 0){
                res[px] = x;
                px += 2;
            }
            else{
                res[nx] = x;
                nx += 2;
            }
        }
        return res;
    }
}