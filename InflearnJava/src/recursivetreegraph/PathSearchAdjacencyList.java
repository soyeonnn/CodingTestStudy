package recursivetreegraph;

import java.util.ArrayList;
import java.util.Scanner;

public class PathSearchAdjacencyList {
	
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int nv : graph.get(v)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		PathSearchAdjacencyList T = new PathSearchAdjacencyList();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		ch = new int[n+1];
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		for(int i=0; i<m; i++) {
			graph.get(sc.nextInt()).add(sc.nextInt());
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
		sc.close();
	}
}
