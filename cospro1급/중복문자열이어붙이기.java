import java.util.*;

class Main {
		public int getLen(String s1, String s2) {
			int len = 0;
			
			for(int i=s2.length(); i>=0; i--) {
					String tmp = s2.substring(0, i);
					if(tmp.length() > s1.length()) continue;
					else {
						String s1Tmp = s1.substring(s1.length()-tmp.length(), s1.length());
						if(tmp.equals(s1Tmp)) {
							len = s1.length()-tmp.length() + s2.length();
							break;
					}
				}
			}
			return len;
		}
	
    public int solution(String s1, String s2) {
        int answer = 0;
				int front = getLen(s1, s2);
				int back = getLen(s2, s1);
				answer = Math.min(front, back);
        return answer;
    }
    
    public static void main(String[] args) {
        Main sol = new Main();
        String s1 = new String("ababc");
        String s2 = new String("abcdab");
        int ret = sol.solution(s1, s2);
        
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
