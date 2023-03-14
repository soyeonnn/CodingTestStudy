class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(char c : my_string.toCharArray()) {
            if(Character.isLowerCase(c)) answer += String.valueOf(c).toUpperCase();
            else answer += String.valueOf(c).toLowerCase();
        }
        return answer;
    }
}