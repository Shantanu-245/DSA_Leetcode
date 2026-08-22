class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long tmp = n;
        long base = 1;
        while(sumDigit(n) > target){
            n = (n / 10) + 1;
            base *= 10;
        }
        return n * base - tmp;
    }
    private long sumDigit(long n){
        long sum = 0;
        while(n > 0){
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
}