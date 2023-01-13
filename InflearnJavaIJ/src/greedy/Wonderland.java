package greedy;

import java.util.Scanner;

class Path {
    public int set, cost;

    public Path(int set, int cost) {
        this.set = set;
        this.cost = cost;
    }
}

public class Wonderland {

    public static Path[] unf;

    public static int Find(int v) {
        if(v == unf[v].set) return v;
        else return unf[v].set = Find(unf[v].set);
    }

    public static void Union(int a, int b, int c) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa].set = fb;
        else {
            unf[fa].cost = Integer.min(unf[fa].cost, c);
            unf[fb].cost = Integer.min(unf[fb].cost, c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        unf = new Path[v+1];
        for(int i=1; i<=v; i++) unf[i] = new Path(i, Integer.MAX_VALUE);
        for(int i=1; i<=e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            Union(a, b, c);
        }

    }
}
