class Solution {
    public int solution(int n) {
        int answer = 1;
        int sub = 1;
        while(true) {
            sub *= answer;
            if(sub > n) break;
            answer++;
        }
        return answer-1;
    }
}