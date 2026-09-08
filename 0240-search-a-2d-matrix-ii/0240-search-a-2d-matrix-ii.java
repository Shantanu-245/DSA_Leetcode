class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        for(int i = 0; i < row; i++){
            if(bs(matrix[i], target)){
                return true;
            }
        }
        return false;
    }
    private static boolean bs(int[] arr, int target){
        int st = 0;
        int ed = arr.length -1;
        while (st <= ed) {
            int md = st + (ed - st) / 2;

            if (arr[md] == target) {
                return true;
            } 
            else if (arr[md] < target) {
                st = md + 1;
            } 
            else {
                ed = md - 1;
            }
        }

        return false;
    }
}