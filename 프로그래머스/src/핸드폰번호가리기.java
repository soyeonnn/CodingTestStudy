class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int strLen = phone_number.length();
        for(int i=0; i<strLen-4; i++) answer += "*";
        answer += phone_number.substring(strLen-4, strLen);
        return answer;
    }
}