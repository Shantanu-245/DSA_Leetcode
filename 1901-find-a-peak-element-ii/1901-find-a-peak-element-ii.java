class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int st = 0;
        int ed = m - 1;
        while(st <= ed){
            int md = st + (ed - st) / 2;
            int row = maxEle(mat, md);
            int left = md - 1 >= 0 ? mat[row][md - 1] : Integer.MIN_VALUE;
            int right = md + 1 < m ? mat[row][md + 1] : Integer.MIN_VALUE;
            if(mat[row][md] > left && mat[row][md] > right){
                return new int[]{row, md};
            }
            else if(mat[row][md] < left){
                ed = md - 1;
            }
            else{
                st = md + 1;
            }
        }
        return new int[]{-1, -1};
    }
    private static int maxEle(int[][] mat,int col){
        int n = mat.length;
        int max = Integer.MIN_VALUE;
        int idx = -1;
        for(int i = 0; i < n; i++){
            if(mat[i][col] > max){
                max = mat[i][col];
                idx = i;
            }
        }
        return idx;
    }
}