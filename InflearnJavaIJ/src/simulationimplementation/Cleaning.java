package simulationimplementation;

import java.util.*;
public class Cleaning {

    static int[] dx = new int[] {0, 1, 0, -1};
    static int[] dy = new int[] {1, 0, -1, 0};

    public int[] solution(int[][] board, int k){
        int[] answer = new int[2];
        int dNum = 0;
        for(int i=0; i<k; i++) {
            int nX = answer[0] + dx[dNum];
            int nY = answer[1] + dy[dNum];
            if(nX < 0 || nX >= board.length || nY < 0 || nY >= board.length || board[nX][nY] == 1) dNum = (dNum + 1) % 4;
            else {
                answer[0] = nX;
                answer[1] = nY;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Cleaning T = new Cleaning();
        int[][] arr1 = {{0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr1, 10)));
        int[][] arr2 = {{0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr2, 20)));
        int[][] arr3 = {{0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr3, 25)));

    }
}
