package string;

import java.util.Scanner;

public class Cryptogram {
	
	public String solution(String str, int num) {
		String answer = "";
		str = str.replace("#", "1");
		str = str.replace("*", "0");
		for(int i=0; i<num; i++) {
			String tmp = str.substring(i*7, (i+1)*7);
			answer += (char)Integer.parseInt(tmp, 2);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Cryptogram T = new Cryptogram();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(str, num));
		sc.close();
	}
}
