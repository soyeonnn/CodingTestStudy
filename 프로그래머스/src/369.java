class Solution {
    public int solution(int order) {
        int answer = 0;
        String num = String.valueOf(order);
        answer = num.length() - num.replaceAll("[3|6|9]", "").length();
        return answer;
    }
}