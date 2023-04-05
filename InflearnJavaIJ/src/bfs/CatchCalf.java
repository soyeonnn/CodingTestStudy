package bfs;

import java.util.*;

// 시간 초과
public class CatchCalf {

    public int solution(int s, int e){
        int L = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i=0; i<len; i++) {
                int cur = q.poll();
                int[] ch = new int[200001];
                if(cur == e) return L;
                if(e >= 200000) return -1;
                int forward = cur + 1;
                int back = cur - 1;
                int twice = cur * 2;
                q.add(forward);
                ch[forward] = 1;
                if(back > 0 && ch[back] == 0) {
                    q.add(back);
                    ch[back] = 1;
                }
                if(ch[twice] == 0) {
                    q.add(twice);
                    ch[twice] = 1;
                }
            }
            L++;
            e += L;
        }
        return -1;
    }

    public static void main(String[] args){
        CatchCalf T = new CatchCalf();
        System.out.println(T.solution(1, 11));
        System.out.println(T.solution(10, 3));
        System.out.println(T.solution(1, 34567));
        System.out.println(T.solution(5, 6));
        System.out.println(T.solution(2, 54321));
    }
}
