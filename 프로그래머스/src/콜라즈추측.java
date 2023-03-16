class Solution {
    public int solution(int num) {
        int answer = 0;
        long tmpNum = num;
        while(tmpNum != 1) {
            if(tmpNum % 2 == 0) tmpNum /= 2;
            else tmpNum = tmpNum * 3 + 1;
            answer++;
            if(answer >= 500) {
                answer = -1;
                break;
            };
        }
        return answer;
    }
}