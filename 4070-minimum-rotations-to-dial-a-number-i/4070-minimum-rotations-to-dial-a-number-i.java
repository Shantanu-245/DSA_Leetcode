class Solution {
    public int minRotations(String s) {
        int n = s.length();
        int res = 0;
        int curr = 0;
        for(int i = 0; i < n; i++){
            int tar = s.charAt(i) - '0';
            int diff = Math.abs(curr - tar);
            res += Math.min(diff, 10 - diff);
            curr = tar;
        }
        return res;
    }
}