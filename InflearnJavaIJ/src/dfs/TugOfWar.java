package dfs;

import java.util.*;

public class TugOfWar {

    static int[] ch;
    static ArrayList<Integer>[] bad;
    static int answer;
    public void DFS(int n, String line) {
        if(line.length() > 1) {
            int last = line.charAt(line.length() - 1) - 48;
            int lastOne = line.charAt(line.length() - 2) - 48;
            if(bad[last].contains(lastOne)) return;
        }
        if(n==7) {
            answer++;
        } else {
            for(int i=1; i<8; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    DFS(n+1, line + i);
                    ch[i] = 0;
                }
            }
        }
    }
    public int solution(int[][] fight){
        answer = 0;
        bad = new ArrayList[8];
        ch = new int[8];
        for(int i=1; i<8; i++) {
            bad[i] = new ArrayList<Integer>();
        }
        for(int[] f : fight) {
            bad[f[0]].add(f[1]);
            bad[f[1]].add(f[0]);
        }
        DFS(0, "");
        return answer;
    }

    public static void main(String[] args){
        TugOfWar T = new TugOfWar();
        System.out.println(T.solution(new int[][]{{1, 3}, {5, 7}, {4, 2}}));
        System.out.println(T.solution(new int[][]{{3, 2}, {3, 5}, {5, 2}, {7, 3}}));
        System.out.println(T.solution(new int[][]{{1, 2}, {1, 5}, {1, 7}, {1, 3}}));
        System.out.println(T.solution(new int[][]{{1, 7}}));
        System.out.println(T.solution(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}}));
    }
}
