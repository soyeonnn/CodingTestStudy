class Solution {
    public int solution(int n) {
        int answer = 1;
        while(answer * 6 % n != 0) answer++;
        return answer;
    }
}