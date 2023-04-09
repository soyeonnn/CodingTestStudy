import java.util.*;
import java.io.*;

public class Main_1260 {

    public static ArrayList<ArrayList<Integer>> graph;
    public static ArrayList<Integer> dfsAns;
    public static int N, M, startV;
    public static int[] dfsCh, bfsCh;
    public static void dfs(int n) {
        dfsCh[n] = 1;
        System.out.print(n + " ");
        ArrayList<Integer> tmp = graph.get(n);
        for(int i=0; i<tmp.size(); i++) {
            if(dfsCh[tmp.get(i)] == 0) {
                dfsCh[tmp.get(i)] = 1;
                dfs(tmp.get(i));
            }
        }
    }

    public static void bfs(int startV) {
        Queue<Integer> q = new LinkedList<>();
        q.add(startV);
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i=0; i<len; i++) {
                int cur = q.poll();
                if(bfsCh[cur] == 0) {
                    bfsCh[cur] = 1;
                    System.out.print(cur + " ");
                }
                ArrayList<Integer> tmp = graph.get(cur);
                for(int j=0; j<tmp.size(); j++) {
                    if (bfsCh[tmp.get(j)] == 0) q.add(tmp.get(j));
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        startV = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for(int i=0; i<=N; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }
        for(int i=0; i<=N; i++) {
            Collections.sort(graph.get(i));
        }

        dfsCh = new int[N+1];
        dfsAns = new ArrayList<>();
        dfs(startV);
        System.out.println();
        bfsCh = new int[N+1];
        bfs(startV);
    }
}
