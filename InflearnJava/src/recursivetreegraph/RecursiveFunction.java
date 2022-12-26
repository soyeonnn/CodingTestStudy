package recursivetreegraph;

public class RecursiveFunction {

	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n-1);
			System.out.print(n + " ");
		}	
	}
	
	public static void main(String[] args) {
		RecursiveFunction T = new RecursiveFunction();
		T.DFS(3);
	}
}
