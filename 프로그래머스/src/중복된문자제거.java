class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.split("");
        for(String s : arr) {
            if(s.length() == 0) answer += " ";
            if(answer.contains(s)) continue;
            answer += s;
        }
        return answer;
    }
}