package array;

import java.util.ArrayList;
import java.util.Scanner;

public class InvertedPrime {

	public boolean isPrime(int n) {
		if(n==1) return false;
		for(int i=2; i<n; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int num : arr) {
			String tmp = new StringBuilder(Integer.toString(num)).reverse().toString();
			if(isPrime(Integer.parseInt(tmp))) answer.add(Integer.parseInt(tmp));
		}
		return answer;
	}
	
	public static void main(String[] args) {
		InvertedPrime T = new InvertedPrime();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
