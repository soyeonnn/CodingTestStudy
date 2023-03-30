package simulationimplementation;

class Password {

    static int[] dx = new int[] {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = new int[] {-1, -0, 1, -1, 1, -1, 0, 1};
    public int solution(int[] keypad, String password){
        int answer = 0;
        int[][] board = new int[3][3];
        int cur = 0;
        int first = password.charAt(0) - 48;
        int x = 0, y = 0;

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(keypad[cur] == first) {
                    x = i;
                    y = j;
                }
                board[i][j] = keypad[cur];
                cur++;
            }
        }

        for(int i=1; i<password.length(); i++) {
           int num = password.charAt(i) - 48;
           if(board[x][y] == num) continue;
           boolean isFind = false;
           for(int j=0; j<8; j++) {
               int nX = x + dx[j];
               int nY = y + dy[j];
               if(nX < 0 || nX > 2 || nY < 0 || nY > 2) continue;
               if(board[nX][nY] == num) {
                   x = nX;
                   y = nY;
                   answer++;
                   isFind = true;
                   break;
               }
           }
           if(!isFind) {
               for(int a=0; a<3; a++) {
                   for(int b=0; b<3; b++) {
                       if(board[a][b] == num) {
                           x = a;
                           y = b;
                           answer += 2;
                           break;
                       }
                   }
               }
           }
        }
        return answer;
    }

    public static void main(String[] args){
        Password T = new Password();
        System.out.println(T.solution(new int[]{2, 5, 3, 7, 1, 6, 4, 9, 8}, "7596218"));
        System.out.println(T.solution(new int[]{1, 5, 7, 3, 2, 8, 9, 4, 6}, "63855526592"));
        System.out.println(T.solution(new int[]{2, 9, 3, 7, 8, 6, 4, 5, 1}, "323254677"));
        System.out.println(T.solution(new int[]{1, 6, 7, 3, 8, 9, 4, 5, 2}, "3337772122"));
    }
}