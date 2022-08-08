package twopointersslidingwindow;

import java.util.Scanner;

public class ConcatenatingTwoArrays {

	public int[] solution(int n1, int[] arr1, int n2, int[] arr2) {
		int[] answer = new int[n1 + n2];
		int answerIndex = 0, arr1Index = 0, arr2Index = 0;
		
		while(arr1Index < n1 && arr2Index < n2) {
			if(arr1[arr1Index] > arr2[arr2Index]) {
				answer[answerIndex] = arr2[arr2Index];
				arr2Index++;
			} else {
				answer[answerIndex] = arr1[arr1Index];
				arr1Index++;
			}
			answerIndex++;
		}
		
		while(answerIndex < (n1+n2)) {
			if(arr1Index < n1) {
				answer[answerIndex] = arr1[arr1Index];
				arr1Index++;
			} else if (arr2Index < n2) {
				answer[answerIndex] = arr2[arr2Index];
				arr2Index++;
			}
			answerIndex++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		ConcatenatingTwoArrays T = new ConcatenatingTwoArrays();
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0; i<n1; i++) {
			arr1[i] = sc.nextInt();
		}
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for(int i=0; i<n2; i++) {
			arr2[i] = sc.nextInt();
		}
		for(int x : T.solution(n1, arr1, n2, arr2)) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
