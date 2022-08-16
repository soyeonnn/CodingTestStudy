package sortingsearching;

import java.util.Scanner;

public class SelectionSortSolution {

	public int[] solution(int n, int[] arr) {
		
		return arr;
	}
	
	public static void main(String[] args) {
		SelectionSortSolution T = new SelectionSortSolution();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
		sc.close();
	}
}
