class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x, 0) + 1);
        }
        List<Integer> res = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) > n /3){
                res.add(key);
            }
        }
        return res;
    }
}