package sortingsearching;

import java.util.Scanner;

public class SelectionSort {

	public int[] solution(int n, int[] arr) {
		for(int i=0; i<n; i++) {
			int min = arr[i], minIndex = i;
			for(int j=i+1; j<n; j++) {
				if(min > arr[j]) {
					min = arr[j];
					minIndex = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		SelectionSort T = new SelectionSort();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		for(int x : T.solution(n, arr)) System.out.print(x + " ");
		sc.close();
	}
}
