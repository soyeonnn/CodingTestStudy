package sortingsearching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public int solution(int n, int m, int[] arr) {
		int answer = 0, lt = 0, rt = n-1, mt;
		Arrays.sort(arr);
		while(lt <= rt) {
			mt = (lt + rt) / 2;
			if(arr[mt] == m) return mt+1;
			else if(arr[mt] > m) rt = mt;
			else lt = mt;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		BinarySearch T = new BinarySearch();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(n, m, arr));
		sc.close();
	}
}
