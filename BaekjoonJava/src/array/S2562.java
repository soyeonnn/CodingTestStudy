package array;

import java.util.Scanner;

public class S2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int max = Integer.MIN_VALUE;
		
		for(int i=1; i<=9; i++) {
			int num = sc.nextInt();
			if(num > max) {
				n = i;
				max = num;
			}
		}
		
		System.out.println(max);
		System.out.println(n);
		
		sc.close();
	}
}
