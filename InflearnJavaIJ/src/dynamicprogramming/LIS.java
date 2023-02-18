package dynamicprogramming;

import java.util.Scanner;

public class LIS {

    static int[] dy;
    public int solution(int[] arr) {
        int answer = 0;
        dy = new int[arr.length];
        dy[0] = 1;
        for(int i=1; i<arr.length; i++) {
            int max = 0;
            for(int j=i-1; j>=0; j--) {
                if(arr[j] < arr[i] && dy[j] > max) max = dy[j];
            }
            dy[i] = max+1;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        LIS T = new LIS();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(arr));
    }
}
