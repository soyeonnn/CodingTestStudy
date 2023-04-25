import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(') {
                st.add('(');
            } else {
                if(st.isEmpty()) {
                    answer = false;
                    break;
                }
                st.pop();
            }
        }
        if(!st.isEmpty()) answer = false;

        return answer;
    }
}