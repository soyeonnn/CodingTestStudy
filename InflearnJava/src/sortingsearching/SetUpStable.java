package sortingsearching;

import java.util.Arrays;

public class SetUpStable {

	public int count(int[] arr, int max) {
		return max;
	}
	
	public int solution(int n, int c, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = arr[1] - arr[0];
		int rt = arr[n-1] - arr[0];
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(count(arr, mid) <= c) {
				answer = mid;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
	}
}
