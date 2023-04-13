import java.util.*;
import java.io.*;
public class Main_24480 {
    static int[] ch;
    static int order;
    static ArrayList<ArrayList<Integer>> graph;
    public static void dfs(int n) {
        ch[n] = order;

        for (int i = 0; i < graph.get(n).size(); i++) {
            int newNode = graph.get(n).get(i);
            if (ch[newNode] == 0) {
                order++;
                dfs(newNode);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int startV = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>();
        for(int i=0; i<=N; i++) graph.add(new ArrayList<>());

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        for(int i=1; i<=N; i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }

        ch = new int[N+1];
        order = 1;
        dfs(startV);
        for(int i=1; i<=N; i++) System.out.println(ch[i]);
    }
}
