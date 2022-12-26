package sortingsearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeastRecentlyUsed {

	public ArrayList<Integer> solution(int s, int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		int capacity = 0;
		for(int x : arr) {
			if(!answer.contains(x)) {
				answer.add(x);
				capacity++;
				if(capacity > s) answer.remove(0);
			} else {
				answer.remove(answer.indexOf(x));
				answer.add(x);
			}
		}
		Collections.reverse(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		LeastRecentlyUsed T = new LeastRecentlyUsed();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		for(int x : T.solution(s, n, arr)) System.out.print(x + " ");
		sc.close();
	}
}
