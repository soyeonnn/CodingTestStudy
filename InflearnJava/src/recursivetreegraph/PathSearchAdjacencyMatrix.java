package recursivetreegraph;

import java.util.Scanner;

public class PathSearchAdjacencyMatrix {

	public static int[] visited;
	static int answer = 0;
	
	public void DFS(int[][] graph, int v, int n) {
		if(v == n) {
			answer++;
			return;
		}
		for(int i=1; i<=graph[v].length-1; i++) {
			if(graph[v][i] == 1 && visited[i] == 0) {
				visited[i] = 1;
				DFS(graph, i, n);
				visited[i] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		PathSearchAdjacencyMatrix T = new PathSearchAdjacencyMatrix();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] graph = new int[n+1][n+1];
		for(int i=0; i<m; i++) {
			graph[sc.nextInt()][sc.nextInt()] = 1;
		}
		visited = new int[n+1];
		visited[1] = 1;
		T.DFS(graph, 1, n);
		System.out.println(answer);
		sc.close();
	}
}
