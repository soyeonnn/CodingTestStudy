package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Meeting implements Comparable<Meeting> {

    public int start, end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting o) {
        if(this.end > o.end) {
            return 1;
        }else if(this.end < o.end) {
            return -1;
        }else {
            if(this.start > o.start) {
                return 1;
            }else {
                return -1;
            }
        }
    }
}
public class MeetingRoomAssignment {

    public int solution(ArrayList<Meeting> arr) {
        int answer = 0;
        int start = Integer.MIN_VALUE, end = Integer.MIN_VALUE;
        Collections.sort(arr);
        for(Meeting m : arr) {
            if(m.start >= start && m.start >= end) {
                answer++;
                start = m.start;
                end = m.end;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        MeetingRoomAssignment T = new MeetingRoomAssignment();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Meeting> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr.add(new Meeting(start, end));
        }
        System.out.println(T.solution(arr));
    }
}
