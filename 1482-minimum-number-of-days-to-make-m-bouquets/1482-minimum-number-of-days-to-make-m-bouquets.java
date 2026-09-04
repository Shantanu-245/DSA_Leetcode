class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int x : bloomDay){
            min = Math.min(x, min);
            max = Math.max(x, max);
        }
        int st = min, ed = max;
        int ans = -1;
        while(st <= ed){
            int md = st + (ed - st) / 2;
            if(possible(bloomDay, md, m, k)){
                ans = md;
                ed = md - 1;
            }
            else{
                st = md + 1;
            }
        }
        return ans;
    }
    private static boolean possible(int[] arr,int d, int m, int k){
        int count = 0;
        int noOfB = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= d){
                count++;
            }
            else{
                noOfB += count / k;
                count = 0;
            }
        }
        noOfB += count / k;
        return noOfB >= m;
    }
}