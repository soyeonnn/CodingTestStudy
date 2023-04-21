import java.util.*;
import java.io.*;
public class Main_2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int computerCnt = Integer.parseInt(br.readLine());
        int pairCnt = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> network = new ArrayList<>();

        for(int i=0; i<computerCnt+1; i++) network.add(new ArrayList<>());

        for(int i=0; i<pairCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int c1 = Integer.parseInt(st.nextToken());
            int c2 = Integer.parseInt(st.nextToken());
            network.get(c1).add(c2);
            network.get(c2).add(c1);
        }

        int[] ch = new int[computerCnt+1];
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        ch[1] = 1;
        while(!q.isEmpty()) {
            int len = q.size();
            for(int i=0; i<len; i++) {
                int cur = q.poll();
                for(int n : network.get(cur)) {
                    if(ch[n] == 0) {
                        ch[n] = 1;
                        answer++;
                        q.offer(n);
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
