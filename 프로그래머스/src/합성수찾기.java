class Solution {
    public int count(int n) {
        int answer = 0;
        for(int i=1; i<=n/2; i++) {
            if(n % i == 0) answer++;
        }
        answer++;
        return answer;
    }
    
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++) {
            if(count(i) >= 3) answer++;
        }
        return answer;
    }
}