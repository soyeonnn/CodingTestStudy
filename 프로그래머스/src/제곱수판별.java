class Solution {
    public int solution(int n) {
        int answer = 0;
        if(Math.sqrt(n) % 1 > 0) answer = 2;
        else answer = 1;
        return answer;
    }
}