package dynamicprogramming;

import java.util.Scanner;

public class ClimbingStairs {

    public int solution(int n) {
        int[] df = new int[n+1];
        df[1] = 1;
        df[2] = 2;
        for(int i=3; i<=n; i++) {
            df[i] = df[i-1] + df[i-2];
        }
        return df[n];
    }
    public static void main(String[] args) {
        ClimbingStairs T = new ClimbingStairs();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
