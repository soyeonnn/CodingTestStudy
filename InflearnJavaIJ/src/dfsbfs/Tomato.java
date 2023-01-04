package dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Tomato {

    public static int[][] tomato;
    public static Queue<Point> Q = new LinkedList<>();
    public static int[] dx = new int[] {-1, 0, 1, 0};
    public static int[] dy = new int[] {0, 1, 0, -1};
    public static int m, n, tomatoCnt = 0, requireTomato;

    public int BFS() {
        int answer = 1;
        while (!Q.isEmpty()) {
            if(tomatoCnt == requireTomato) return answer;
            if(answer > m) return -1;
            Point tmp = Q.poll();
            if(tmp.x == -1) {
                Q.offer(new Point(-1, -1));
                answer++;
                continue;
            }
            for(int i=0; i<4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && tomato[nx][ny] == 0) {
                    tomato[nx][ny] = 1;
                    tomatoCnt++;
                    Q.offer(new Point(nx, ny));
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Tomato T = new Tomato();
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        tomato = new int[n][m];
        requireTomato = m*n;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) {
                tomato[i][j] = sc.nextInt();
                if(tomato[i][j] == 1) {
                    Q.offer(new Point(i, j));
                    tomatoCnt++;
                }
                if(tomato[i][j] == -1) requireTomato--;
            }
        }
        Q.offer(new Point(-1, -1));
        System.out.println(T.BFS());
    }
}
