package simulationimplementation;

import java.util.*;

public class Ladder {

    public char[] solution(int n, int[][] ladder){
        char[] answer = new char[n];
        for(int i=1; i<=n; i++) {
            int curLadder = i;
            for(int[] down : ladder) {
                for(int num : down) {
                    if(num == curLadder) {
                        curLadder++;
                        break;
                    } else if(num == curLadder-1) {
                        curLadder--;
                        break;
                    }
                }
            }
            int ch = i + 64;
            answer[curLadder-1] = (char)ch;
        }
        return answer;
    }

    public static void main(String[] args) {
        Ladder T = new Ladder();
        System.out.println(Arrays.toString(T.solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}})));
        System.out.println(Arrays.toString(T.solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}})));
        System.out.println(Arrays.toString(T.solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}})));
        System.out.println(Arrays.toString(T.solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}})));
    }
}
