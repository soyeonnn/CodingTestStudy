package dfs;

import java.util.*;
public class CasesOfFelindrome {

    static int[] ch;
    static String S;
    static int len;
    static ArrayList<String> felindrome;

    public boolean isFelindrome(String s) {
        boolean result = false;
        StringBuffer sb = new StringBuffer(s);
        if(s.equals(sb.reverse().toString())) return true;
        return result;
    }
    public void dfs(int n, String s) {
        if(n==len) {
            if(isFelindrome(s)) {
                if(!felindrome.contains(s)) felindrome.add(s);
            }
        } else {
            for(int i=0; i<len; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    dfs(n+1, s+S.charAt(i));
                    ch[i] = 0;
                }
            }
        }
    }
    public String[] solution(String s){
        String[] answer;
        ch = new int[s.length()];
        len = s.length();
        S = s;
        felindrome = new ArrayList<>();
        dfs(0, "");
        answer = new String[felindrome.size()];
        for(int i=0; i<felindrome.size(); i++) answer[i] = felindrome.get(i);
        return answer;
    }

    public static void main(String[] args){
        CasesOfFelindrome T = new CasesOfFelindrome();
        System.out.println(Arrays.toString(T.solution("aaaabb")));
        System.out.println(Arrays.toString(T.solution("abbcc")));
        System.out.println(Arrays.toString(T.solution("abbccee")));
        System.out.println(Arrays.toString(T.solution("abbcceee")));
        System.out.println(Arrays.toString(T.solution("ffeffaae")));
    }
}
