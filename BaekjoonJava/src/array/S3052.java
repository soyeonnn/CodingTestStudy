package array;

import java.util.Scanner;

public class S3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] m = new int[42];
		int answer = 0;
		
		for(int i=0; i<10; i++) {
			int num = sc.nextInt();
			m[num % 42]++;
		}
		
		for(int i=0; i<m.length; i++) {
			if(m[i] > 0) answer++;
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}
