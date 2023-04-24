import java.util.*;
import java.io.*;
public class Main_7562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        int[] dx = new int[] {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = new int[] {1, 2, 2, 1, -1, -2, -2, -1};

        for(int i=0; i<t; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] ch = new int[N][N];

            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[] {startX, startY});
            int L = 0;
            while(!q.isEmpty()) {
                int len = q.size();
                for(int a=0; a<len; a++) {
                    int[] cur = q.poll();
                    if(endX == cur[0] && endY == cur[1]) {
                        System.out.println(L);
                        break;
                    }
                    for(int b=0; b<8; b++) {
                        int nX = cur[0] + dx[b];
                        int nY = cur[1] + dy[b];
                        if(nX < 0 || nX >= N || nY < 0 || nY >=N || ch[nX][nY] == 1) continue;
                        ch[nX][nY] = 1;
                        q.offer(new int[] {nX, nY});
                    }
                }
                L++;
            }
        }
    }
}
