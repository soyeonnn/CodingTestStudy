import java.util.*;
import java.io.*;
public class Main_7569 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[][][] box = new int[H][N][M];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<H; i++) {
            for(int j=0; j<N; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<M; k++) {
                    int n = Integer.parseInt(st.nextToken());
                    box[i][j][k] = n;
                    if(box[i][j][k] == 1) q.offer(new int[]{i, j, k});
                }
            }
        }

        int answer = -1;
        int[] dx = new int[] {0, 1, 0, -1, 0, 0};
        int[] dy = new int[] {1, 0, -1, 0, 0, 0};
        int[] dz = new int[] {0, 0, 0, 0, 1, -1};
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i=0; i<len; i++) {
                int[] cur = q.poll();
                for(int j=0; j<6; j++) {
                    int nX = cur[1] + dx[j];
                    int nY = cur[2] + dy[j];
                    int nZ = cur[0] + dz[j];
                    if(nX < 0 || nX >= N || nY < 0 || nY >= M || nZ < 0 || nZ >= H || box[nZ][nX][nY] == 1 || box[nZ][nX][nY] == -1) continue;
                    q.offer(new int[] {nZ, nX, nY});
                    box[nZ][nX][nY] = 1;
                }
            }
            answer++;
        }

        for(int i=0; i<H; i++) {
            for(int j=0; j<N; j++) {
                for(int k=0; k<M; k++) {
                    if(box[i][j][k] == 0) {
                        answer = -1;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
