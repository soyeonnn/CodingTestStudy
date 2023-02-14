package greedy;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge2 implements Comparable<Edge2> {

    public int vex;
    public int cost;

    public Edge2(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge2 o) {
        return this.cost - o.cost;
    }
}

public class WonderlandSolutionPQ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Edge2>> graph = new ArrayList<ArrayList<Edge2>>();
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<Edge2>());
        }
        int[] ch = new int[n + 1];
        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge2(b, c));
            graph.get(b).add(new Edge2(a, c));
        }
        int answer = 0;
        PriorityQueue<Edge2> pQ = new PriorityQueue<>();
        pQ.offer(new Edge2(1,0));
        while(!pQ.isEmpty()) {
            Edge2 tmp = pQ.poll();
            int ev = tmp.vex;
            if(ch[ev]==0) {
                ch[ev] = 1;
                answer+=tmp.cost;
                for(Edge2 ob : graph.get(ev)) {
                    if(ch[ob.vex]==0) pQ.offer(new Edge2(ob.vex, ob.cost));
                }
            }
        }
        System.out.println(answer);
    }
}
