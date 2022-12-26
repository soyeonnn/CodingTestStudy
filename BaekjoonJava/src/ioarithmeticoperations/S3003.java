package ioarithmeticoperations;

import java.util.Scanner;

public class S3003 {

	public int[] solution(int[] arr) {
		int[] answer = new int[6];
		int[] require = {1, 1, 2, 2, 2, 8};
		for(int i=0; i<6; i++) answer[i] = require[i] - arr[i];
		return answer;
	}
	
	public static void main(String[] args) {
		S3003 T = new S3003();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		for(int i=0; i<6; i++) arr[i] = sc.nextInt();
		for(int x : T.solution(arr)) System.out.print(x + " ");
		sc.close();
	}
}
