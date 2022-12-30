package dfsbfs;

import java.util.Scanner;

public class FindPermutation {

    public static int n, m;
    public static int[] pm, ch;

    public void DFS(int L, int[] arr) {
        if(L == m) {
            for(int n : pm) System.out.print(n + " ");
            System.out.println();
        } else {
            for(int i=0; i<n; i++) {
                if(ch[i] == 1) continue;
                else {
                    pm[L] = arr[i];
                    ch[i] = 1;
                    DFS(L+1, arr);
                }
            }
        }
    }
    public static void main(String[] args) {
        FindPermutation T = new FindPermutation();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[n];
        int[] ch = new int [m];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        T.DFS(0, arr);
    }
}
