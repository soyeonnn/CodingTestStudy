import java.util.*;

class Main {
    public String solution(String phrases, int second) {
        String answer = "";
				String temp = "______________";
				temp = temp.concat(phrases);

				for (int i = 0; i < second; i++) {
					char tmp = temp.charAt(0);
					temp += tmp;
					temp = temp.substring(1);
				}

				answer = temp.substring(0, phrases.length());
				return answer;
    }
    
    public static void main(String[] args) {
        Main sol = new Main();
        String phrases = new String("happy-birthday");
        int second = 3;
        String ret = sol.solution(phrases, second);
        
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
    }
}