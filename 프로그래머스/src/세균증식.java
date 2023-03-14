class Solution {
    public int solution(int n, int t) {
        int answer = 0;
        answer = (n*2) * (int)Math.pow(2, t-1);
        return answer;
        
        // 다른 풀이
        // answer = n << t;
    }
}