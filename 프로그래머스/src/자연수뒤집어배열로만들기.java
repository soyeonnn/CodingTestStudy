import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        String num = String.valueOf(n);
        StringBuffer sb = new StringBuffer(num);
        String reversedStr = sb.reverse().toString();
        int i=0;
        for(char c : reversedStr.toCharArray()) {
            answer[i] = Character.getNumericValue(c);
            i++;
        }
        return answer;
    }
}