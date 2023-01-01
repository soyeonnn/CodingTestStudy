package dfsbfs;

import java.util.Scanner;

public class FindCombination {

    public static int n,m;
    public static int[] pm, ch;

    public void DFS(int L) {

        if(L==m) {
            for (int num : pm) System.out.print(num + " ");
            System.out.println();
        } else {
            for(int i=1; i<=n; i++) {
                if(ch[i] == 0) {
                    if(L > 0 && pm[L-1] > i) continue;
                    ch[i] = 1;
                    pm[L] = i;
                    DFS(L+1);
                    ch[i] = 0;
                }

            }
        }
    }

    public static void main(String[] args) {
        FindCombination T = new FindCombination();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        ch = new int[n+1];
        T.DFS(0);
    }
}
