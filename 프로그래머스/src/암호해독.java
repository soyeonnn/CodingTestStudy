class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int i = 1;
        for(char c : cipher.toCharArray()) {
            if(i == code) {
                answer += c;
                i = 0;
            }
            i++;
        }
        return answer;
    }
}