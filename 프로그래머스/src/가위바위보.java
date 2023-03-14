class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(char c : rsp.toCharArray()) {
            if(c == '0') answer += '5';
            else if(c == '2') answer += '0';
            else answer += '2';
        }
        return answer;
    }
}