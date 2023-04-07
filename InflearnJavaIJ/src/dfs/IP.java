package dfs;

import java.util.*;
public class IP {

    static String S;
    static int len;
    static int[] ch;
    ArrayList<String> validIp;

    public void dfs(int n) {
        if(n==3) {
            String ip = "";
            String numStr = "";
            for(int i=0; i<len; i++) {
                numStr += S.charAt(i);
                if(ch[i] == 1) {
                    int num = Integer.parseInt(numStr);
                    if(Integer.toString(num).length() != numStr.length()) return;
                    if(num > 255) return;
                    ip += num + ".";
                    numStr = "";
                }
            }
            int num = Integer.parseInt(numStr);
            if(Integer.toString(num).length() != numStr.length()) return;
            if(num > 255) return;
            ip += num;
            if(!validIp.contains(ip)) validIp.add(ip);
        } else {
            for(int i=0; i<len; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    dfs(n+1);
                    ch[i] = 0;
                }
            }
        }
    }
    public String[] solution(String s){
        String[] answer;
        validIp = new ArrayList<>();
        S = s;
        len = s.length();
        ch = new int[s.length()];
        dfs(0);
        answer = new String[validIp.size()];
        for(int i=0; i<validIp.size(); i++) answer[i] = validIp.get(i);
        return answer;
    }

    public static void main(String[] args){
        IP T = new IP();
        System.out.println(Arrays.toString(T.solution("2025505")));
        System.out.println(Arrays.toString(T.solution("0000")));
        System.out.println(Arrays.toString(T.solution("255003")));
        System.out.println(Arrays.toString(T.solution("155032012")));
        System.out.println(Arrays.toString(T.solution("02325123")));
        System.out.println(Arrays.toString(T.solution("121431211")));
    }
}
