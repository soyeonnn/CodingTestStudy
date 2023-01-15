import java.util.*;

class Main {
    public int[] solution(String commands) {
        int[] answer = {0, 0};
				int x = 0;
				int y = 0;
				for(char command : commands.toCharArray()) {
					if(command == 'L') answer[0]--;
					else if(command == 'R') answer[0]++;
					else if(command == 'U') answer[1]++;
					else answer[1]--;
				}
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        String commands = "URDDL";
        int[] ret = sol.solution(commands);

        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}