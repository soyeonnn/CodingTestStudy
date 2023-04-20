import java.util.*;
import java.io.*;
public class Main_2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] board = new int[N][M];
        int[][] ch = new int[N][M];

        for(int i=0; i<N; i++) {
            String tmp = br.readLine();
            String[] tmpSplit = tmp.split("");
            for(int j=0; j<M; j++) {
                board[i][j] = Integer.parseInt(tmpSplit[j]);
            }
        }

        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {1, 0, -1, 0};
        int L = 1;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0, 0});
        board[0][0] = 0;
        while(!q.isEmpty()) {
            int len = q.size();
            L++;
            for(int i=0; i<len; i++) {
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                for(int d=0; d<4; d++) {
                    int nX = x + dx[d];
                    int nY = y + dy[d];
                    if(nX < 0 || nX >= N || nY < 0 || nY >= M || board[nX][nY] == 0) continue;
                    ch[nX][nY] = L;
                    q.offer(new int[] {nX, nY});
                    board[nX][nY] = 0;
                }
            }
        }
        System.out.println(ch[N-1][M-1]);
    }
}
