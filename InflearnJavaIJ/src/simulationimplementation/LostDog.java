package simulationimplementation;

public class LostDog {

    static int[] dx = new int[] {-1, 0, 1, 0};
    static int[] dy = new int[] {0, 1, 0, -1};

    public int solution(int[][] board){
        int answer = 0;
        int[] hLoc = new int[2];
        int[] dLoc = new int[2];
        int hD = 0, dD = 0;
        for(int i=0; i<board.length; i++) {
            for(int j=0; j< board.length; j++) {
                if(board[i][j] == 2) {
                    hLoc[0] = i;
                    hLoc[1] = j;
                } else if(board[i][j] == 3) {
                    dLoc[0] = i;
                    dLoc[1] = j;
                }
            }
        }

        while(hLoc[0] != dLoc[0] || hLoc[1] != dLoc[1]) {
            if(answer >= 10000) {
                answer = 0;
                break;
            }
            int hNX = hLoc[0] + dx[hD];
            int hNY = hLoc[1] + dy[hD];
            if (hNX < 0 || hNX >= board.length || hNY < 0 || hNY >= board.length || board[hNX][hNY] == 1)
                hD = (hD + 1) % 4;
            else {
                hLoc[0] = hNX;
                hLoc[1] = hNY;
            }

            int dNX = dLoc[0] + dx[dD];
            int dNY = dLoc[1] + dy[dD];
            if (dNX < 0 || dNX >= board.length || dNY < 0 || dNY >= board.length || board[dNX][dNY] == 1)
                dD = (dD + 1) % 4;
            else {
                dLoc[0] = dNX;
                dLoc[1] = dNY;
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        LostDog T = new LostDog();
        int[][] arr1 = {{0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 2, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0, 1},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 1, 0, 0, 0, 0, 0, 0}};
        System.out.println(T.solution(arr1));
        int[][] arr2 = {{1, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0, 2, 1},
                {0, 0, 0, 1, 0, 1, 0, 0, 0, 1},
                {0, 1, 0, 1, 0, 0, 0, 0, 0, 3}};
        System.out.println(T.solution(arr2));
    }
}
