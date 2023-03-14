class Solution {
    public String solution(int age) {
        String answer = "";
        for(char num : String.valueOf(age).toCharArray()) {
            char c = (char)(Character.getNumericValue(num) + 97);
            answer += String.valueOf(c);
        }
        return answer;
    }
}