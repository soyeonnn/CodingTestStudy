package bfs;

import java.util.*;

public class GoHome {

    public int solution(int[] pool, int a, int b, int home){
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int[] poolCh = new int[1000];
        for(int num : pool) poolCh[num] = 1;
        int[] backCh = new int[10000];
        int[] jumpCh = new int[10000];
        q.add(a);
        jumpCh[0] = 1;
        jumpCh[a] = 1;
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i=0; i<len; i++) {
                int next = q.poll();
                if(next == home) return answer+1;
                int jump = next + a;
                int back = next - b;
                if(backCh[jump] == 1) backCh[jump] = 0;
                if(jumpCh[jump] == 0 && poolCh[jump] != 1) {
                    jumpCh[jump] = 1;
                    q.add(jump);
                }
                if(back > 0) {
                    if(backCh[next] == 0 && poolCh[back] != 1) {
                        backCh[back] = 1;
                        jumpCh[back] = 1;
                        q.add(back);
                    }
                    if(backCh[next] == 1) {
                        backCh[next] = 0;
                    }
                }
            }
            answer++;
        }
        return -1;
    }

    public static void main(String[] args){
        GoHome T = new GoHome();
        System.out.println(T.solution(new int[]{11, 7, 20}, 3, 2, 10));
        System.out.println(T.solution(new int[]{1, 15, 11}, 3, 2, 5));
        System.out.println(T.solution(new int[]{9, 15, 35, 30, 20}, 2, 1, 25));
        System.out.println(T.solution(new int[]{5, 12, 7, 19, 23}, 3, 5, 18));
        System.out.println(T.solution(new int[]{10, 15, 20}, 3, 2, 2));
    }
}
