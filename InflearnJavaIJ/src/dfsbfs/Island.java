package dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Island {

    public static int n, answer = 0;
    public static int[][] board;
    public static int[] dx = new int[] {-1, -1, -1, 0, 0, 1, 1, 1};
    public static int[] dy = new int[] {-1, 0, 1, -1, 1, -1, 0, 1};
    public static Queue<Point> Q = new LinkedList<>();

    public void BFS(int x, int y) {
        Q.offer(new Point(x, y));
        board[x][y] = 0;
        while(!Q.isEmpty()) {
            Point tmp = Q.poll();
            for(int i=0; i<8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny <n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    Q.offer(new Point(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) {
        Island T = new Island();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j] == 1) {
                    T.BFS(i, j);
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
