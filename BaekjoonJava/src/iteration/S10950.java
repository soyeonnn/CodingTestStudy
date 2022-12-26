package iteration;

import java.util.Scanner;

public class S10950 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
		sc.close();
	}
}
