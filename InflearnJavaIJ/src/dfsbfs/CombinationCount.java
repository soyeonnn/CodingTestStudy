package dfsbfs;

import java.util.Scanner;

public class CombinationCount {

    public int DFS(int n, int r) {
        if(r == 0 || n == r) return 1;
        else if(r==1) return n;
        else {
            return DFS(n-1, r-1) + DFS(n-1, r);
        }
    }

    public static void main(String[] args) {
        CombinationCount T = new CombinationCount();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.DFS(n, r));
    }
}
