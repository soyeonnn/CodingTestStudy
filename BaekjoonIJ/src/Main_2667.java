import java.util.*;
import java.io.*;
public class Main_2667 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];

        for(int i=0; i<N; i++) {
            String input = br.readLine();
            String[] inputSplit = input.split("");
            for(int j=0; j<N; j++) {
                board[i][j] = Integer.parseInt(inputSplit[j]);
            }
        }

        int[] dx = new int[] {0, 1, 0, -1};
        int[] dy = new int[] {1, 0, -1, 0};
        int complexTotal = 0;
        ArrayList<Integer> complex = new ArrayList<>();
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(board[i][j] == 1) {
                    complexTotal++;
                    int tmpComplex = 1;
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[] {i,j});
                    board[i][j] = 0;
                    while(!q.isEmpty()) {
                        int len = q.size();
                        for(int a=0; a<len; a++) {
                            int[] cur = q.poll();
                            int x = cur[0];
                            int y = cur[1];
                            for(int b=0; b<4; b++) {
                                int nX = x + dx[b];
                                int nY = y + dy[b];
                                if(nX < 0 || nX >= N || nY < 0 || nY >= N || board[nX][nY] == 0) continue;
                                board[nX][nY] = 0;
                                q.offer(new int[] {nX, nY});
                                tmpComplex++;
                            }
                        }
                    }
                    complex.add(tmpComplex);
                }
            }
        }

        System.out.println(complexTotal);
        Collections.sort(complex);
        for(int n : complex) System.out.println(n);
    }
}
