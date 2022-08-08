package twopointersslidingwindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 시간 초과
public class FindCommonElements {
	
	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(a[i] == b[j]) answer.add(a[i]);
			}
		}
		
		Collections.sort(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		FindCommonElements T = new FindCommonElements();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) a[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++) b[i] = sc.nextInt();
		for(int x : T.solution(n, m, a, b)) System.out.print(x + " ");
		sc.close();
	}
}
