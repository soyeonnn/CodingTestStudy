class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(after);
        for(char c : before.toCharArray()) {
            if(sb.indexOf(String.valueOf(c)) > -1) sb.deleteCharAt(sb.indexOf(String.valueOf(c)));
        }
        if(sb.length() == 0) answer = 1;
        return answer;
    }
}