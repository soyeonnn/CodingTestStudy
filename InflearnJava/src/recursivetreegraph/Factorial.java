package recursivetreegraph;

public class Factorial {

	public int DFS(int n) {
		if(n == 1) return 1;
		else return n * DFS(n-1);
	}
	
	public static void main(String[] args) {
		Factorial T = new Factorial();
		System.out.println(T.DFS(5));
	}
}