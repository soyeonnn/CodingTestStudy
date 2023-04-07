package bfs;

import java.util.*;
public class BuildHouse {

    static int[] dx = new int[] {-1, 0, 1, 0};
    static int[] dy = new int[] {0, 1, 0, -1};
    public int solution(int[][] board){
        int answer = Integer.MAX_VALUE;
        ArrayList<int[]> buildings = new ArrayList<>();

        // 빌딩 위치 저장
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == 1) buildings.add(new int[] {i, j});
            }
        }

        // 빌딩 개수 만큼 테이블 생성
        ArrayList<int[][]> buildingCnt = new ArrayList<>();
        for(int i=0; i<buildings.size(); i++) buildingCnt.add(new int[board.length][board[0].length]);

        for(int i=0; i<buildings.size(); i++) {
            int buildingX = buildings.get(i)[0];
            int buildingY = buildings.get(i)[1];
            int L = 0;
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[] {buildingX, buildingY});
            while(!q.isEmpty()) {
                int len = q.size();
                L++;
                for(int a=0; a<len; a++) {
                    int[] cur = q.poll();
                    int x = cur[0];
                    int y = cur[1];
                    for(int b=0; b<4; b++) {
                        int nX = x + dx[b];
                        int nY = y + dy[b];
                        if(nX < 0 || nX >= board.length || nY < 0 || nY >= board.length || board[nX][nY] > 0 || buildingCnt.get(i)[nX][nY] > 0) continue;
                        buildingCnt.get(i)[nX][nY] = L;
                        q.offer(new int[] {nX, nY});
                    }
                }
            }
        }

        for(int a=0; a<board.length; a++) {
            for(int b=0; b<board[0].length; b++) {
                int sum = 0;
                boolean flag = true;
                for(int i=0; i<buildings.size(); i++) {
                    if(buildingCnt.get(i)[a][b] == 0) flag = false;
                    sum += buildingCnt.get(i)[a][b];
                }
                if(flag) answer = Math.min(answer, sum);
            }
        }
        if(answer == Integer.MAX_VALUE) answer = -1;

        return answer;
    }

    public static void main(String[] args){
        BuildHouse T = new BuildHouse();
        System.out.println(T.solution(new int[][]{{1, 0, 2, 0, 1}, {0, 0, 0, 0, 0}, {0, 2, 1, 0, 0}, {2, 0, 0, 2, 2}, {0, 0, 0, 0, 0}}));
        System.out.println(T.solution(new int[][]{{1, 0, 0, 1}, {0, 0, 2, 0}, {0, 0, 1, 0}, {2, 2, 0, 0}}));
        System.out.println(T.solution(new int[][]{{1, 2, 0, 0}, {0, 0, 1, 2}, {0, 2, 0, 0}, {0, 2, 1, 0}}));
        System.out.println(T.solution(new int[][]{{1, 0, 0, 1}, {0, 0, 2, 0}, {0, 0, 1, 0}, {2, 2, 0, 1}}));
    }
}
