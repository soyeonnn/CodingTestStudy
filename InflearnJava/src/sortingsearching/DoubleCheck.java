package sortingsearching;

import java.util.Scanner;
import java.util.TreeSet;

public class DoubleCheck {

	public char solution(int n, int[] arr) {
		char answer = 'U';
		TreeSet<Integer> set = new TreeSet<>();
		for(int x : arr) set.add(x);
		if(set.size() != arr.length) return 'D';
		return answer;
	}
	
	public static void main(String[] args) {
		DoubleCheck T = new DoubleCheck();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(n, arr));
		sc.close();
	}
}
