package dfsbfs;

import java.util.Scanner;

public class CoinExchange {

    static int n, m;
    static int answer = Integer.MAX_VALUE;
    static int[] arr;
    public void DFS(int L, int cnt) {
        if(L == 0) {
            if(answer > cnt) answer = cnt;
        } else if(L < 0) return;
        else {
            for(int i=arr.length-1; i>=0; i--) {
                DFS(L-arr[i], cnt+1);
            }
        }
    }
    public static void main(String[] args) {
        CoinExchange T = new CoinExchange();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        m = sc.nextInt();
        T.DFS(m, 0);
        System.out.println(answer);
    }
}
