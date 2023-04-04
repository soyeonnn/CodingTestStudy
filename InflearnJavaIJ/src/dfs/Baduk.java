package dfs;

public class Baduk {

    static int playerCnt, answer;
    static int ch[];
    public void dfs(int n, int[][] cans) {
        if(n == playerCnt / 2) {
            int white = 0;
            int black = 0;
            for(int i=0; i<ch.length; i++) {
                if(ch[i] == 1) white += cans[i][0];
                else black += cans[i][1];
            }
            answer = Math.min(answer, Math.abs(white-black));
        } else {
            for(int i=0; i<playerCnt; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    dfs(n+1, cans);
                    ch[i] = 0;
                }
            }
        }
    }

    public int solution(int[][] cans){
        answer = Integer.MAX_VALUE;
        playerCnt = cans.length;
        ch = new int[playerCnt];
        dfs(0, cans);
        return answer;
    }

    public static void main(String[] args){
        Baduk T = new Baduk();
        System.out.println(T.solution(new int[][]{{87, 84}, {66, 78}, {94, 94}, {93, 87}, {72, 92}, {78, 63}}));
        System.out.println(T.solution(new int[][]{{10, 20}, {15, 25}, {35, 23}, {55, 20}}));
        System.out.println(T.solution(new int[][]{{11, 27}, {16, 21}, {35, 21}, {52, 21}, {25, 33},{25, 32}, {37, 59}, {33, 47}}));
    }
}
