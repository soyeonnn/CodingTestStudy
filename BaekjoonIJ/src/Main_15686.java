import java.util.*;
import java.io.*;
public class Main_15686 {
    public static ArrayList<int[]> house, chicken;
    public static int[] chickenCh;
    public static int[][] board;
    public static int N, M, answer;

    public static void dfs(int n, int cnt) {
        if(cnt == 0) {
            ArrayList<int[]> chickenSelect = new ArrayList<>();
            for(int i=0; i<chickenCh.length; i++) {
                if(chickenCh[i] == 1) chickenSelect.add(new int[] {chicken.get(i)[0], chicken.get(i)[1]});
            }

            int totalC = 0;
            for(int i=0; i<house.size(); i++) {
                int hX = house.get(i)[0];
                int hY = house.get(i)[1];
                int hC = Integer.MAX_VALUE;
                for(int j=0; j<chickenSelect.size(); j++) {
                    hC = Math.min(hC, Math.abs(chickenSelect.get(j)[0] - hX) + Math.abs(chickenSelect.get(j)[1] - hY));
                }
                totalC += hC;
            }

            answer = Math.min(answer, totalC);

        } else {
            for(int i=n; i<chicken.size(); i++) {
                chickenCh[i] = 1;
                dfs(i+1, cnt-1);
                chickenCh[i] = 0;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new int[N][N];
        house = new ArrayList<>();
        chicken = new ArrayList<>();
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if(board[i][j] == 1) house.add(new int[] {i, j});
                if(board[i][j] == 2) chicken.add(new int[] {i, j});
            }
        }

        chickenCh = new int[chicken.size()];
        answer = Integer.MAX_VALUE;
        dfs(0, M);
        System.out.println(answer);
    }
}
