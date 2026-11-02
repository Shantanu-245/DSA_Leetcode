class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefix = new int[n + 1];
        for(int i = 0; i < n; i++){
            prefix[i + 1] = prefix[i] ^ arr[i];
        }
        int[] ans = new int[queries.length];
        int idx = 0;
        for(int[] q : queries){
            int l = q[0];
            int r = q[1];

            ans[idx] = prefix[r + 1] ^ prefix[l];

            idx++;
        }
        
        return ans;
    }
}