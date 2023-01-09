package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Friend implements Comparable<Friend>{
    int start, end;

    public Friend(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Friend o) {
        if(this.end == o.end) return this.start - o.start;
        else return this.end - o.end;
    }
}
public class Wedding {

    public int solution(int n, ArrayList<Friend> arr) {
        int cnt = 0;
        Collections.sort(arr);
        int et = 0;
        for(Friend ob : arr) {
            if(ob.start > et) {
                cnt++;
                et=ob.end;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Wedding T = new Wedding();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Friend> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr.add(new Friend(start, end));
        }
        System.out.println(T.solution(n, arr));
    }
}
