package dfs;

import java.util.*;
public class AlphaCode {

    static int[] ch;
    static int len, answer;
    static LinkedList<Integer> tmp;

    public void dfs(int start, String s) {
        if(start == len) {
            answer++;
        } else {
            for(int i=start; i<len; i++) {
                if(s.charAt(start) == '0' && i > start) return;
                int num = Integer.parseInt(s.substring(start, i+1));
                if(num <= 0 || num > 26) return;
                tmp.add(num);
                dfs(i+1, s);
                tmp.pollLast();
            }
        }
    }

    public int solution(String s){
        answer = 0;
        len = s.length();
        ch = new int[len];
        tmp = new LinkedList<>();
        dfs(0, s);
        return answer;
    }

    public static void main(String[] args){
        AlphaCode T = new AlphaCode();
        System.out.println(T.solution("25114"));
        System.out.println(T.solution("23251232"));
        System.out.println(T.solution("21020132"));
        System.out.println(T.solution("21350"));
        System.out.println(T.solution("120225"));
        System.out.println(T.solution("232012521"));
    }
}
