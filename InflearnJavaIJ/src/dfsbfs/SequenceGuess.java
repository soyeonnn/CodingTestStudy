package dfsbfs;

import java.util.Scanner;

public class SequenceGuess {

    public static int n, f;
    public static int[] cResult, permutation, ch;
    public static boolean flag;

    public int combination(int n, int r){
        if(r==0 || r==n)
            return 1;
        else
            return combination(n-1, r-1) + combination(n-1, r);
    }
    
    public void DFS(int L, int sum) {
        if(flag) return;
        if(L == n){
            if(sum == f) {
                for (int num : permutation) System.out.print(num + " ");
                System.out.println();
                flag = true;
            }
        } else {
            for(int i=1; i<=n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    permutation[L] = i;
                    DFS(L + 1, sum + (permutation[L] * cResult[L]));
                    ch[i] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        SequenceGuess T = new SequenceGuess();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f = sc.nextInt();
        cResult = new int[n];
        permutation = new int[n];
        ch = new int[n+1];
        for(int i=0; i<n; i++) cResult[i] = T.combination(n-1,i);
        T.DFS(0, 0);
    }
}
