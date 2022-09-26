package array;

import java.util.Arrays;
import java.util.Scanner;

public class S1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		
		double sum = 0;
		int maxNum = arr[n-1];
		for(int i=0; i<n; i++) sum = sum + (double)arr[i] / maxNum * 100;
		System.out.println(sum / n);
		sc.close();
	}
}
