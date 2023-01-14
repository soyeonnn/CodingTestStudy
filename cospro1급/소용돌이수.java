import java.util.*;

class Main {
    public int solution(int n) {
        int answer = 0;
        int[][] arr = new int[n][n];
        int dir = 0;
        int x=0, y=0;
        for(int i=1; i<=n*n; i++) {
            arr[x][y] = i;
            
            if(dir == 0 && (y == n-1 || arr[x][y+1] != 0)) dir++;
            else if(dir == 1 && (x == n-1 || arr[x+1][y] != 0)) dir++;
            else if(dir == 2 && (y == 0 || arr[x][y-1] != 0)) dir++;
            else if(dir == 3 && (x==0 || arr[x-1][y] != 0)) dir = 0;
            
            if(dir==0) y++;
            else if(dir==1) x++;
            else if(dir==2) y--;
            else if(dir==3) x--;
        }
        
        for(int i=0; i<n; i++) answer += arr[i][i];
				
        return answer;
    }
    
    public static void main(String[] args) {
        Main sol = new Main();
        int n1 = 3;
        int ret1 = sol.solution(n1);

        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int n2 = 2;
        int ret2 = sol.solution(n2);
        
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}