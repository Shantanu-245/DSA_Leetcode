class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int pro = 1;
        int tmp = n;
        while(tmp > 0){
            int d = tmp % 10;
            sum += d;
            pro *= d;
            tmp /= 10;
        }
        return n % (sum + pro) == 0;
    }
}