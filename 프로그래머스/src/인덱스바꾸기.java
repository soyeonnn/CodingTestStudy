class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        char num1Char = sb.charAt(num1);
        sb.replace(num1, num1+1, String.valueOf(sb.charAt(num2)));
        sb.replace(num2, num2+1, String.valueOf(num1Char));
        answer = sb.toString();
        return answer;
    }
}