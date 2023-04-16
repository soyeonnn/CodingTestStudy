class Solution {
    public String solution(String s) {
        String answer = "";
        String[] trimString = s.split(" ");
        for(String str : trimString) {
            if(str.length() == 0) {
                answer += " ";
                continue;
            }
            if(Character.isDigit(str.charAt(0))) answer += str + " ";
            else {
                String first = str.substring(0, 1).toUpperCase();
                String all = str.substring(1).toLowerCase();
                answer += first + all + " ";
            }
        }
        answer = answer.substring(0, answer.length()-1);
        return answer;
    }
}