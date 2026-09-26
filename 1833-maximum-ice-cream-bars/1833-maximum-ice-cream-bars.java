class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max = 0;
        for(int n : costs){
            max = Math.max(max, n);
        }
        int[] count = new int[max + 1];
        for(int n : costs){
            count[n]++;
        }
        int idx = 0;
        for(int i = 0; i <= max; i++){
            while(count[i] > 0){
                costs[idx] = i;
                idx++;
                count[i]--;
            }
        }
        int res = 0;
        for(int cost : costs){
            if(coins >= cost){
                coins -= cost;
                res++;
            }
            else{
                break;
            }
        }
        return res;
    }
}