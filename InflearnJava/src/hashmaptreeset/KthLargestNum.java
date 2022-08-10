package hashmaptreeset;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class KthLargestNum {

	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		Set<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());
		Arrays.sort(arr);
		
		for(int i=n-1; i>1; i--) {
			for(int j=i-1; j>0; j--) {
				for(int l=j-1; l>=0; l--) {
					int sum = (arr[i] + arr[j] + arr[l]);
					set.add(sum);
				}
			}
		}
		
		Iterator<Integer> it = set.iterator();
		for(int i=0; i<k; i++) answer = it.next();
 		
		return answer;
	}
	
	public static void main(String[] args) {
		KthLargestNum T = new KthLargestNum();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(n, k, arr));
		sc.close();
	}
}