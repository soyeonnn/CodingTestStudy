import java.util.*;
import java.io.*;
public class Main_14503 {

    static int[] dx = new int[] {-1, 0, 1, 0};
    static int[] dy = new int[] {0, -1, 0, 1};
    static int N, M, x, y, dir;
    static int[][] room;

    public static int solution() {
        int answer = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x, y});
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i=0; i<len; i++) {
                int[] cur = q.poll();

                // 청소가 되어 있지 않으면 청소(벽-1 과 청소-2 는 구분 되어야 함!!)
                if(room[cur[0]][cur[1]] == 0) {
                    room[cur[0]][cur[1]] = 2;
                    answer++;
                }

                // 주변에 청소해야 할 칸이 있는 경우 찾아서 이동
                boolean isClean = true;
                for(i=dir+1; i<dir+5; i++) {
                    int nX = cur[0] + dx[i%4];
                    int nY = cur[1] + dy[i%4];
                    if(nX < 0 || nX > N || nY < 0 || nY > M || room[nX][nY] == 1 || room[nX][nY] == 2) continue;
                    q.offer(new int[] {nX, nY});
                    dir = i%4;
                    isClean = false;
                    break;
                }

                // 주변에 청소해야 할 칸이 없는 경우, 뒤로 가거나 벽이면 멈추기
                if(isClean) {
                    int bX, bY;
                    if(dir==0 || dir==2) {
                        bX = cur[0] + dx[2 - dir];
                        bY = cur[1] + dy[2 - dir];
                    } else {
                        bX = cur[0] + dx[4 - dir];
                        bY = cur[1] + dy[4 - dir];
                    }
                    if(bX < 0 || bX > N || bY < 0 || bY > M || room[bX][bY] == 1) return answer;
                    q.offer(new int[] {bX, bY});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 방의 크기 입력받기
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        room = new int[N][M];

        // 로봇 청소기의 현재 위치와 방향 입력받기
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        dir = 4 - Integer.parseInt(st.nextToken());
        if(dir == 4) dir = 0;

        // 방 상태 입력받기
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++) {
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(solution());
    }
}
