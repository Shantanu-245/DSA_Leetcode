class Solution {
    public int longestBalanced(int[] nums) {
        int res = 0;
        
        int n = nums.length;
        for(int i = 0; i < n; i++){
            Set<Integer> eset = new HashSet<>();
            Set<Integer> oset = new HashSet<>();
            for(int j = i; j < n; j++){
                if(nums[j] % 2 == 0){
                    eset.add(nums[j]);
                }
                else{
                    oset.add(nums[j]);
                }
                if(eset.size() == oset.size()){
                res = Math.max(res, j - i + 1);
            }
            }   
        }
        return res;
    }
}