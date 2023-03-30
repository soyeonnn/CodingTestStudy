package simulationimplementation;

import java.util.*;
public class MeetingRoom {

    public int[] solution(int[] enter, int[] exit){
        int[] answer = new int[enter.length];
        int[][] meetCnt = new int[enter.length][enter.length];
        int[] meetingRoom = new int[enter.length+1];
        int enterIdx = 0;

        for (int exitNum : exit) {
            if(meetingRoom[exitNum] == 1) {
                meetingRoom[exitNum] = 0;
                continue;
            }
            while (enterIdx < enter.length) {
                int enterNum = enter[enterIdx];
                enterIdx++;
                meetingRoom[enterNum] = 1;
                if (enterNum == exitNum) {
                    ArrayList<Integer> meetPeople = new ArrayList<>();
                    for (int num = 1; num < meetingRoom.length; num++) {
                        if (meetingRoom[num] == 1) meetPeople.add(num-1);
                    }
                    for(int p : meetPeople) {
                        for(int j : meetPeople) {
                            meetCnt[p][j] = 1;
                        }
                    }
                    break;
                }
            }
            meetingRoom[exitNum] = 0;
        }

        for(int i=0; i<enter.length; i++) {
            for(int j=0; j<enter.length; j++) {
                if(meetCnt[j][i] == 1 && i != j) answer[i]++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        MeetingRoom T = new MeetingRoom();
        System.out.println(Arrays.toString(T.solution(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 2, 5, 3, 4}, new int[]{2, 3, 1, 4, 5})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 3, 2, 4, 5, 7, 6, 8}, new int[]{2, 3, 5, 6, 1, 4, 8, 7})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 4, 7, 2, 3, 5, 6}, new int[]{5, 2, 6, 1, 7, 3, 4})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 4, 2, 3}, new int[]{2, 1, 4, 3})));
    }
}
