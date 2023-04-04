import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> numS = new Stack<>();
        String[] splitS = s.split(" ");
        for(String w : splitS) {
            if(w.equals("Z")) {
                int num = numS.pop();
                answer -= num;
            }
            else {
                int num = Integer.parseInt(w);
                numS.push(num);
                answer += num;
            }
        }
        return answer;
    }
}