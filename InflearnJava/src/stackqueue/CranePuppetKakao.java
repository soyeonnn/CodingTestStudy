package stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class CranePuppetKakao {

	public int craneOne(int[][] boardArr, int boardNum, int boardLen) {
		int craneNum = 0;
		for(int i=1; i<=boardLen; i++) {
			if(boardArr[i][boardNum] != 0) {
				craneNum = boardArr[i][boardNum];
				boardArr[i][boardNum] = 0;
				return craneNum;
			}
		}
		return craneNum;
	}
	
	public int solution(int boardLen, int[][] boardArr, int moveNum, int[] moveArr) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();		
		for(int x : moveArr) {
			int craneNum = craneOne(boardArr, x, boardLen);
			if (craneNum != 0) {
				if(stack.isEmpty()) stack.push(craneNum);
				else {
					stack.push(craneNum);
					int popNum = stack.get(stack.size()-2);
					while(popNum == craneNum) {
						stack.pop();
						answer++;
						if(stack.isEmpty()) break;
						popNum = stack.lastElement();
					}
				}				
			}
		}
		return answer;	
	}
	
	public static void main(String[] args) {
		CranePuppetKakao T = new CranePuppetKakao();
		Scanner sc = new Scanner(System.in);
		int boardLen = sc.nextInt();
		int[][] boardArr = new int[boardLen+1][boardLen+1];
		for(int i=1; i<=boardLen; i++) {
			for(int j=1; j<=boardLen; j++) {
				boardArr[i][j] = sc.nextInt();
			}
		}
		int moveNum = sc.nextInt();
		int[] moveArr = new int[moveNum];
		for(int i=0; i<moveNum; i++) moveArr[i] = sc.nextInt();
		System.out.println(T.solution(boardLen, boardArr, moveNum, moveArr));
		sc.close();
	}
}
