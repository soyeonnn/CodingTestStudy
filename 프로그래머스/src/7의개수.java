class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int num : array) {
            String s = Integer.toString(num);
            answer += s.length() - s.replace("7", "").length();
        }
        return answer;
    }
}