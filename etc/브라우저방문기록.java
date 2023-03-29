import java.util.*;

class Solution {
    public String[] solution(String[][] C) {
        Stack<String> H = new Stack<>();
        Stack<String> B = new Stack<>();
        for(int i=0; i<C.length; i++) {
            if(C[i][0].equals("PUSH")) {
                H.add(C[i][1]);
            } else if(C[i][0].equals("BACK")) {
                int cnt = Integer.parseInt(C[i][1]);
                for(int j=0; j<cnt; j++) {
                    String back = H.pop();
                    B.add(back);
                }
            } else if(C[i][0].equals("NEXT")) {
                int cnt = Integer.parseInt(C[i][1]);
                for(int j=0; j<cnt; j++) {
                    String next = B.pop();
                    H.add(next);
                }
            }
        }
        String[] answer = new String[H.size()];
        for(int i=0; i<H.size(); i++) answer[i] = H.get(i);
        return answer;
    }
}