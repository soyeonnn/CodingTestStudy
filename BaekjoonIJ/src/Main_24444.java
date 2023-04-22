import java.util.*;
import java.io.*;
public class Main_24444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int startV = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<=N; i++) graph.add(new ArrayList<>());

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());

            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        for(int i=1; i<=N; i++) Collections.sort(graph.get(i));

        int[] ch = new int[N+1];
        Queue<Integer> q = new LinkedList<>();
        int L = 1;
        ch[startV] = L;
        L++;
        q.offer(startV);
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i=0; i<len; i++) {
                int cur = q.poll();
                for(int n : graph.get(cur)) {
                    if(ch[n] == 0) {
                        ch[n] = L++;
                        q.offer(n);
                    }
                }
            }
        }

        for(int i=1; i<=N; i++) System.out.println(ch[i]);
    }
}
