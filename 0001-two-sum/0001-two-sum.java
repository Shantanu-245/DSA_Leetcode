class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int com = target - nums[i];
            if(mpp.containsKey(com)){
                return new int[]{mpp.get(com), i};
            }
            mpp.put(nums[i], i);
        }
        return new int[]{};
    }
}