package array;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintLargeNum {

	public ArrayList<Integer> solution(int n, int[] num) {
		ArrayList<Integer> LargeNum = new ArrayList<Integer>();
		LargeNum.add(num[0]);
		
		for(int i=1; i<n; i++) {
			if(num[i-1] < num[i]) LargeNum.add(num[i]);
		}
		
		return LargeNum;
	}
	
	public static void main(String[] args) {
		PrintLargeNum T = new PrintLargeNum();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i : T.solution(n, num)) {
			System.out.print(i + " ");
		}
		sc.close();
	}
}
