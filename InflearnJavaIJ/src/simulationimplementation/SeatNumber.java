package simulationimplementation;

import java.util.*;

public class SeatNumber {

    static int[] dx = new int[] {0, 1, 0, -1};
    static int[] dy = new int[] {1, 0, -1, 0};

    public int[] solution(int c, int r, int k){
        int[] answer = new int[2];
        int[][] board = new int[c+1][r+1];
        int x=1, y=1, dir=0, cnt=1;
        board[x][y] = 1;
        for(int i=0; i<k-1; i++) {
            if(k > c*r) {
                x = 0;
                y = 0;
                break;
            }
            int nX = x + dx[dir];
            int nY = y + dy[dir];
            if(nX < 1 || nX > c || nY < 1 || nY > r || board[nX][nY] == 1) {
                dir = (dir+1) % 4;
                i--;
            }
            else {
                board[nX][nY] = 1;
                x = nX;
                y = nY;
            }

        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }

    public static void main(String[] args){
        SeatNumber T = new SeatNumber();
        System.out.println(Arrays.toString(T.solution(6, 5, 12)));
        System.out.println(Arrays.toString(T.solution(6, 5, 20)));
        System.out.println(Arrays.toString(T.solution(6, 5, 30)));
        System.out.println(Arrays.toString(T.solution(6, 5, 31)));
    }
}
