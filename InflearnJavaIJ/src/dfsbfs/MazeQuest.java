package dfsbfs;

import java.util.Scanner;

public class MazeQuest {

    public static int[][] maze, ch;
    public static int[] dx = new int[] {0, -1, 0, 1};
    public static int[] dy = new int[] {1, 0, -1, 0};
    public static int answer = 0;

    public void DFS(int x, int y) {
        if(x == 6 && y == 6) {
            answer++;
        }else {
            for(int i=0; i<4; i++) {
                int nX = x + dx[i];
                int nY = y + dy[i];
                if(nX < 0 || nX >= 7 || nY < 0 || nY >= 7) continue;
                if(maze[nX][nY] == 0 && ch[nX][nY] == 0) {
                    ch[nX][nY] = 1;
                    DFS(nX, nY);
                    ch[nX][nY] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        MazeQuest T = new MazeQuest();
        Scanner sc = new Scanner(System.in);
        maze = new int[7][7];
        ch = new int[7][7];
        for(int i=0; i<7; i++) {
            for(int j=0; j<7; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        T.DFS(0, 0);
        System.out.println(answer / 2);
    }
}
