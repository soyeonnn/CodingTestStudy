import java.util.*;
import java.io.*;
public class Main_2644 {
    public static int A, B, answer;
    public static ArrayList<ArrayList<Integer>> g;
    public static void dfs(int L, int n, int p) {
        if(n == B) answer = L;
        for(int num : g.get(n)) {
            if(num != p) {
                dfs(L+1, num, n);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());
        g = new ArrayList<>();
        for(int i=0; i<=N; i++) g.add(new ArrayList<>());
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            g.get(a).add(b);
            g.get(b).add(a);
        }

        dfs(0, A, 0);
        if(answer == 0) System.out.println(-1);
        else System.out.println(answer);
    }
}
