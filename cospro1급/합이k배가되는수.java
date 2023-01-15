import java.util.*;

class Main {
    public int solution(int[] arr, int K) {
        int answer = 0;
				for(int i=0; i<arr.length; i++) {
					for(int j=i+1; j<arr.length; j++) {
						for(int k=j+1; k<arr.length; k++) {
							if((arr[i] + arr[j] + arr[k]) % K == 0) answer++;
						}
					}
				}
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int[] arr = {1, 2, 3, 4, 5};
        int K = 3;
        int ret = sol.solution(arr, K);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}