package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class WeddingTime implements Comparable<WeddingTime> {

    public int time;
    public char state;

    public WeddingTime(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(WeddingTime o) {
        if(this.time == o.time) return this.state - o.state;
        else return this.time - o.time;
    }
}

public class WeddingSolution {

    public int solution(ArrayList<WeddingTime> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;
        for(WeddingTime ob : arr) {
            if(ob.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }
        return answer;
    }
    public static void main(String[] args) {
        WeddingSolution T = new WeddingSolution();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<WeddingTime> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr.add(new WeddingTime(start, 's'));
            arr.add(new WeddingTime(end, 'e'));
        }
        System.out.println(T.solution(arr));
    }
}
