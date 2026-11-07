class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int count = 0;

        long left = 0;
        long right = 0;
        for(int l = 0; l < n/2; l++){
            left += nums[l];
        }
        for(int r = n/2 ; r < n; r++){
            right += nums[r];
        }

        if(left > right){
            count++;
        }
        for(int i = 0; i < n - 1; i++){
            left -= nums[i];
            right += nums[i];

            int j = (i + n/2) % n;

            left += nums[j];
            right -= nums[j];

            if(left > right){
                count++;
            }
        }
        return count;
    }
}