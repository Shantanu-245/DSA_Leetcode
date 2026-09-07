class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int st = 0, ed = n * m - 1;
        while(st <= ed){
            int md = st + (ed - st) / 2;
            int r = md / m;
            int c = md % m;
            if(matrix[r][c] == target){
                return true;
            }
            else if(matrix[r][c] > target){
                ed = md - 1;
            }
            else{
                st = md + 1;
            }
        }
        return false;
    }
}