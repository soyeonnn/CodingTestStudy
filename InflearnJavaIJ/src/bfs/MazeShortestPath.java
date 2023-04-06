package bfs;

import java.util.*;
public class MazeShortestPath {

    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{1, 0, -1, 0};
    public int solution(int[][] board){
        int answer = 0;
        Queue<int[]> q = new LinkedList<>();
        board[0][0] = 1;
        q.offer(new int[] {0,0});
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i=0; i<len; i++) {
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                if(x == 6 && y == 6) return answer;
                for(int j=0; j<4; j++) {
                    int nX = x + dx[j];
                    int nY = y + dy[j];
                    if(nX < 0 || nX >= 7 || nY < 0 || nY >= 7 || board[nX][nY] == 1) continue;
                    board[nX][nY] = 1;
                    q.offer(new int[] {nX, nY});
                }
            }
            answer++;
        }
        return -1;
    }

    public static void main(String[] args){
        MazeShortestPath T = new MazeShortestPath();
        int[][] arr={{0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {1, 1, 0, 1, 0, 1, 1},
                {1, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 0},
                {1, 0, 1, 0, 0, 0, 0}};
        int[][] arr2 = {{0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {1, 1, 0, 1, 1, 1, 1},
                {1, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 0, 1, 0, 0},
                {1, 0, 1, 0, 1, 0, 0}};
        System.out.println(T.solution(arr));
        System.out.println(T.solution(arr2));
    }
}
