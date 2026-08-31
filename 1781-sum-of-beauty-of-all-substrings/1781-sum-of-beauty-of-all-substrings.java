class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int ans = 0;
        for(int i = 0; i < n; i++){

            int[] freq = new int[26];

            for(int j = i; j < n; j++){

               freq[s.charAt(j) - 'a']++;

               ans += checkfreq(freq);
            }

        }
        return ans;
    }
    private int checkfreq(int[] freq){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int c : freq){
            if(c > 0){
            min = Math.min(min, c);
            max = Math.max(max, c);
            }
        }

        return max - min;
    }
}