class Solution {
    public long solution(long n) {
        long answer = 0;
        double base = Math.sqrt(n);
        if (base % 1 > 0) {
        	answer = -1;
        }
        else answer = (long)Math.pow(base+1, 2);
        return answer;
    }
}