package array;

import java.util.Scanner;

public class S4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int stuCnt = sc.nextInt();
			int sum = 0;
			int[] arr = new int[stuCnt];
			for(int j=0; j<stuCnt; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			double avg = (double)(sum / stuCnt);
			int avgCnt = 0;
			for(int j=0; j<stuCnt; j++) {
				if(arr[j] > avg) avgCnt++;
			}
			
			System.out.println(String.format("%.3f", (double)avgCnt / stuCnt * 100) + "%");
		}
		
		sc.close();
	}
}
