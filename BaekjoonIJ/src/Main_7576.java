import java.util.*;
import java.io.*;
public class Main_7576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] box = new int[N][M];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if(box[i][j] == 1) q.offer(new int[] {i, j});
            }
        }

        int answer = -1;
        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {1, 0, -1, 0};
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i=0; i<len; i++) {
                int[] cur = q.poll();
                for(int j=0; j<4; j++) {
                    int nX = cur[0] + dx[j];
                    int nY = cur[1] + dy[j];
                    if(nX < 0 || nX >= N || nY < 0 || nY >= M || box[nX][nY] == 1 || box[nX][nY] == -1) continue;
                    q.offer(new int[] {nX, nY});
                    box[nX][nY] = 1;
                }
            }
            answer++;
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(box[i][j] == 0) {
                    answer = -1;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
