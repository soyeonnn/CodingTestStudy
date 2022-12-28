package dfsbfs;

import java.util.Scanner;

public class DuplicatePermutations {

    static int[] pm;
    static int n, m;

    public void DFS(int L) {
        if(L == m) {
            for(int num : pm) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
           for(int i=1; i<=n; i++) {
               pm[L] = i;
               DFS(L+1);
           }
        }
    }

    public static void main(String[] args) {
        DuplicatePermutations T = new DuplicatePermutations();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}
