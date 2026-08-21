class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums, 0, nums.length - 1);
    }
    private int mergesort(int[] nums,int st,int ed){
        if(st >= ed) return 0;

        int md = st + (ed - st) / 2;
        int count = mergesort(nums, st, md) + mergesort(nums, md + 1, ed);

        count += countpairs(nums,st,md,ed);

        merge(nums, st, md, ed);

        return count;
    }
    private int countpairs(int[] nums,int st,int md, int ed){
        int c = 0;
        int j = md + 1;
        for(int i = st; i <= md; i++){
            while(j <= ed && (long)nums[i] > 2L * nums[j]){
                j++;
            }
            c += j - (md + 1);
        }

        return c;
    }
    private void merge(int[] nums,int st,int md,int ed){
        List<Integer> list = new ArrayList<>();
        int i = st;
        int j = md + 1;
        while(i <= md && j <= ed){
            if(nums[i] < nums[j]){
                list.add(nums[i]);
                i++;
            }
            else{
                list.add(nums[j]);
                j++;
            }
        }
        while(i <= md) list.add(nums[i++]);
        while(j <= ed) list.add(nums[j++]);

        for(int k = 0; k < list.size(); k++){
            nums[k + st] = list.get(k);
        }
    }
}