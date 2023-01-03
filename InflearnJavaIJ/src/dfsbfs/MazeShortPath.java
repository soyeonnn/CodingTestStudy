package dfsbfs;

import java.util.Scanner;

public class MazeShortPath {

    public static int[][] maze;
    public static int[] dx = new int[] {-1, 0, 1, 0};
    public static int[] dy = new int[] {0, 1, 0, -1};
    public static int answer = Integer.MAX_VALUE;

    public void DFS(int x, int y, int count) {
        if(x == 7 && y == 7) answer = Integer.min(count, answer);
        else {
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    DFS(nx, ny, count+1);
                    maze[nx][ny] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        MazeShortPath T = new MazeShortPath();
        Scanner sc = new Scanner(System.in);
        maze = new int[8][8];
        for(int i=1; i<=7; i++) {
            for(int j=1; j<=7; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        maze[1][1] = 1;
        T.DFS(1, 1, 0);
        if(answer == 2147483647) answer = -1;
        System.out.println(answer);
    }
}
