import java.util.*;

class Main {
    public static int[] dx = new int[] {-1, -2, -3, -4, -1, -2, -3, -4, 1, 2, 3, 4, 1, 2, 3, 4};
    public static int[] dy = new int[] {-1, -2, -3, -4, 1, 2, 3, 4, -1, -2, -3, -4, 1, 2, 3, 4};
    public int solution(String[] bishops) {
        int answer = 0;
        int[][] board = new int[9][9];
        for(String bishop : bishops) {
            int x = bishop.charAt(1) - '0';
            int y = bishop.charAt(0) - 64;
            board[x][y] = 1;
            for(int i=0; i<16; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 1 && nx < 9 && ny >= 1 && ny < 9) board[nx][ny] = 1;
            }
        }
        
        for(int i=1; i<9; i++) {
            for(int j=1; j<9; j++) {
                if(board[i][j] == 0) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        String[] bishops1 = {new String("D5")};
        int ret1 = sol.solution(bishops1);
        
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
        int ret2 = sol.solution(bishops2);
        
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}