import java.util.*;

class Main {
    public long solution(long num) {
        long answer = num + 1;
		String tmp = String.valueOf(answer);
		tmp = tmp.replace('0', '1');
		answer = Long.parseLong(tmp);
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        long num = 9949999;
        long ret = sol.solution(num);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}