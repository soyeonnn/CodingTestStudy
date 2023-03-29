class Solution {
    public int cnt(int num) {
        int cnt = 0;   
        for(int i=1; i<=num/2; i++) {
            if(num % i == 0) cnt++;
        }
        cnt++;
        return cnt;
    }
    
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++) {
            int meCnt = cnt(i);
            if(meCnt % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }
    
    // 제곱수인 경우 약수의 개수가 홀수, 제곱수가 아닌 경우 약수의 개수가 짝수
}