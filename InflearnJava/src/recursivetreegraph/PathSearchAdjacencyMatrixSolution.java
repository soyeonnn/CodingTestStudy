package recursivetreegraph;

import java.util.Scanner;

public class PathSearchAdjacencyMatrixSolution {

	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;
	
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int i=1; i<=n; i++) {
				if(graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		PathSearchAdjacencyMatrixSolution T = new PathSearchAdjacencyMatrixSolution();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		for(int i=0; i<m; i++) {
			graph[sc.nextInt()][sc.nextInt()] = 1;
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
		sc.close();
	}
}
