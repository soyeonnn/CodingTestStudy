package hashmaptreeset;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class KthLargestNumSolution {

	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<Integer>(Collections.reverseOrder());
		Arrays.sort(arr);	
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l=j+1; l<n; l++) {
					Tset.add(arr[i] + arr[j] + arr[l]);
				}
			}
		}
		int cnt = 0;
		
		// 값 지우기
		// Tset.remove(143);
		// 원소의 개수 구하기
		// Tset.size();
		// 오름차순이면 최소값, 내림차순이면 최대값
		// Tset.first()
		// 오름차순이면 최대값, 내림차순이면 최소값
		// Tset.last();
		
		for(int x : Tset) {
			cnt++;
			if(cnt == k) return x;
		} 		
		return answer;
	}
	
	public static void main(String[] args) {
		KthLargestNumSolution T = new KthLargestNumSolution();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(n, k, arr));
		sc.close();
	}
}
