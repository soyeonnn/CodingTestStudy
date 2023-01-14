import java.util.*;

class Main {
    public int solution(String pos) {
				int answer = 0;
				int x = pos.charAt(1) - '0';
      	int y = (int)pos.charAt(0) - 64;
				int[] dx = new int[] {1, 1, 2, 2, -1, -1, -2, -2};
				int[] dy = new int[] {-2, 2, -1, 1, -2, 2, -1, 1};
				for(int i=0; i<8; i++) {
					int nx = x + dx[i];
					int ny = y + dy[i];
					if(nx > 0 && nx <= 8 && ny > 0 && ny <= 8) answer++;
				}
        
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        String pos = "A7";
        int ret = sol.solution(pos);
    	
        
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}