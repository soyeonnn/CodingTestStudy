package utilizedatastructure;

import java.util.*;

public class DecompressOverlapping {
    public String solution(String s){
        String answer = "";
        Stack<Integer> nS = new Stack<>();
        Stack<String> sS = new Stack<>();

        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) nS.add(Character.getNumericValue(c));
            else if(c == '(') sS.add("#");
            else if(c == ')') {
                int repeatCnt = nS.pop();
                StringBuilder sb = new StringBuilder();
                String tmpStr = sS.pop();
                while(!tmpStr.equals("#")) {
                    sb.insert(0, tmpStr);
                    tmpStr = sS.pop();
                }
                String putStr = "";
                for(int i=0; i<repeatCnt; i++) putStr += sb.toString();
                sS.add(putStr);
            } else sS.add(String.valueOf(c));
        }

        for(String str : sS) answer += str;
        return answer;
    }

    public static void main(String[] args){
        DecompressOverlapping T = new DecompressOverlapping();
        System.out.println(T.solution("3(a2(b))ef"));
        System.out.println(T.solution("2(ab)k3(bc)"));
//        System.out.println(T.solution("2(ab3((cd)))"));
        System.out.println(T.solution("2(2(ab)3(2(ac)))"));
        System.out.println(T.solution("3(ab2(sg))"));
    }
}
