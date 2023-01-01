package dfsbfs;

import java.util.Scanner;

public class FindCombinationSolution {

    public static int n,m;
    public static int[] combi;

    public void DFS(int L, int s) {
        if(L==m) {
            for (int num : combi) System.out.print(num + " ");
            System.out.println();
        } else {
            for(int i=s; i<=n; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        FindCombinationSolution T = new FindCombinationSolution();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        combi = new int[m];
        T.DFS(0, 1);
    }
}
