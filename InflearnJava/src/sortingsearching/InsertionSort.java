package sortingsearching;

import java.util.Scanner;

public class InsertionSort {

	public int[] solution(int n, int[] arr) {
		for(int i=1; i<n; i++) {
			int compNum = arr[i], lt = i-1, rt = i;
			while(lt >= 0) {
				if(arr[lt] > compNum) {
					int tmp = arr[rt];
					arr[rt] = arr[lt];
					arr[lt] = tmp;
					rt--;
					lt--;
				} else break;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		InsertionSort T = new InsertionSort();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
		sc.close();
	}
}
