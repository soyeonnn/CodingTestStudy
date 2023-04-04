class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(!(s.length() == 4 || s.length() == 6)) answer = false;
        else {
            for(char c : s.toCharArray()) {
                if(!Character.isDigit(c)) answer = false;
            }
        }
        return answer;
    }
}