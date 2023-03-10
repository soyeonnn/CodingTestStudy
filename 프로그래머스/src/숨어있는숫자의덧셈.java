class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String tmpNum = "";
        for(char c : my_string.toCharArray()) {
            if(Character.isDigit(c)) {
                tmpNum += c;
            } else {
                if(tmpNum.length() > 0) {
                    answer += Integer.parseInt(tmpNum);
                    tmpNum = "";
                }
            }
        }
        if(tmpNum.length() > 0) {
            answer += Integer.parseInt(tmpNum);
            tmpNum = "";
        }
        return answer;
    }
}