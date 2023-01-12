package greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class AreYouFriend {

    public static ArrayList<ArrayList<Integer>> arr;
    public static boolean answer = false;

    public void solution(int a, int b) {
        if(a == b) {
            answer = true;
        }
        else {
            for(int friend : arr.get(a)) {
                solution(friend, b);
            }
        }
    }

    public static void main(String[] args) {
        AreYouFriend T = new AreYouFriend();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++) {
            arr.add(new ArrayList<Integer>());
        }
        for(int i=0; i<m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr.get(a).add(b);
        }
        int fOne = sc.nextInt();
        int fTwo = sc.nextInt();
        T.solution(fOne, fTwo);
        if(answer) System.out.println("YES");
        else System.out.println("NO");
    }
}
