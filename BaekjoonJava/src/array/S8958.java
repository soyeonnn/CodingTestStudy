package array;

import java.util.Scanner;

public class S8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			String input = sc.next();
			int sum = 0;
			int score = 0;
			for(char x : input.toCharArray()) {
				if(x == 'O') {
					score++;
					sum += score;
				} else score = 0;
			}
			System.out.println(sum);
		}
		
		sc.close();
	}
}
