class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        if(str1.replaceAll(str2, "").length() == str1.length()) answer = 2;
        else answer = 1;
        return answer;

        // 다른 답안
        // return (str1.contains(str2)? 1: 2);
    }
}







