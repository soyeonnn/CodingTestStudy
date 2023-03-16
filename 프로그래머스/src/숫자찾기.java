class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String numString = String.valueOf(num);
        if(numString.indexOf(String.valueOf(k)) + 1 > 0) answer = numString.indexOf(String.valueOf(k)) + 1;
        return answer;
    }
}