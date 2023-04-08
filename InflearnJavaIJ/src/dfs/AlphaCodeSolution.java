package dfs;

public class AlphaCodeSolution {

    int[] dy;
    public int DFS(int start, String s){
        if(dy[start] > 0) return dy[start];
        if(start < s.length() && s.charAt(start) == '0') return 0;
        if(start == s.length() -1 || start == s.length()) return 1;
        else{
            int res = DFS(start + 1, s);
            int tmp = Integer.parseInt(s.substring(start, start + 2));
            if(tmp <= 26) res += DFS(start + 2, s);
            return dy[start] = res;
        }
    }

    public int solution(String s){
        dy = new int[101];
        int answer = DFS(0, s);
        return answer;
    }

    public static void main(String[] args){
        AlphaCodeSolution T = new AlphaCodeSolution();
        System.out.println(T.solution("25114"));
        System.out.println(T.solution("23251232"));
        System.out.println(T.solution("21020132"));
        System.out.println(T.solution("21350"));
        System.out.println(T.solution("120225"));
        System.out.println(T.solution("232012521"));
    }
}
