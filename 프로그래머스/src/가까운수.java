class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int diff = Integer.MAX_VALUE;
        for(int num : array) {
            if(Math.abs(n-num) < diff) {
                answer = num;
                diff = Math.abs(n-num);
            } else if(Math.abs(n-num) == diff) answer = Math.min(answer, num);
        }
        return answer;
    }
}