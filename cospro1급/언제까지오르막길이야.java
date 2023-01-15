import java.util.*;

class Main {
    public int solution(int[] arr) {
        int answer = Integer.MIN_VALUE;
				int min = Integer.MAX_VALUE;
				for(int i=0; i<arr.length-1; i++) {
					int cur = arr[i];
					int nex = arr[i+1];
					if(cur < nex) {
						min = Math.min(min, cur);
					} else {
						answer = Math.max(answer, cur - min);
						min = Integer.MAX_VALUE;
					}
				}
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
        int ret = sol.solution(arr);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
