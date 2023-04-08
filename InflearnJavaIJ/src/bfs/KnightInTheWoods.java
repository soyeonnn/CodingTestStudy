package bfs;

import java.util.*;
public class KnightInTheWoods {
    public int solution(int[][] board){
        int answer = Integer.MAX_VALUE;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int N = board.length, M = board[0].length;
        int[][] dis = new int[N][M];
        ArrayList<int[]> strawberrys = new ArrayList<>();

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if (board[i][j] == 2 || board[i][j] == 3) {
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[] {i, j});
                    int L = 0;
                    int[][] ch = new int[N][M];
                    while(!q.isEmpty()) {
                        int len = q.size();
                        L++;
                        for(int a=0; a<len; a++) {
                            int[] cur = q.poll();
                            for(int b=0; b<4; b++) {
                                int nX = cur[0] + dx[b];
                                int nY = cur[1] + dy[b];
                                if(nX >= 0 && nX < N && nY >= 0 && nY < M && board[nX][nY] != 1) {
                                    if(ch[nX][nY] == 0) {
                                        ch[nX][nY] = 1;
                                        dis[nX][nY] += L;
                                        q.offer(new int[]{nX, nY});
                                    }
                                }
                            }
                        }
                    }
                } else if(board[i][j] == 4) strawberrys.add(new int[] {i, j});
            }
        }

        for(int[] strawberry : strawberrys) {
            if(dis[strawberry[0]][strawberry[1]] > 0) {
                answer = Math.min(answer, dis[strawberry[0]][strawberry[1]]);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        KnightInTheWoods T = new KnightInTheWoods();
        System.out.println(T.solution(new int[][]{{4, 1, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 1, 0, 0},
                {0, 2, 1, 1, 3, 0, 4, 0},
                {0, 0, 0, 4, 1, 1, 1, 0}}));
        System.out.println(T.solution(new int[][]{{3, 0, 0, 0, 1, 4, 4, 4},
                {0, 1, 1, 0, 0, 0, 1, 0},
                {0, 1, 4, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {1, 0, 1, 0, 0, 1, 1, 0},
                {4, 0, 0, 0, 1, 0, 0, 0},
                {4, 1, 0, 0, 1, 0, 0, 0},
                {4, 0, 0, 0, 0, 0, 1, 2}}));
        System.out.println(T.solution(new int[][]{{4, 1, 0, 1, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 2, 3, 4},
                {0, 1, 0, 1, 0}}));
    }
}
