package recursivetreegraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 시간 초과
class Path {
	int data;
	Path one, five, minus;
	public Path(int val) {
		data = val;
		one = five = minus = null;
	}
}

public class FindCalf {
	
	Path root;
	
	public int solution(int e) {
		int answer = 0;
		Queue<Path> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				Path cur = Q.poll();
				if(cur.data == e) return L;
				cur.one = new Path(cur.data + 1);
				cur.minus = new Path(cur.data - 1);
				cur.five = new Path(cur.data + 5);
				Q.offer(cur.one);
				Q.offer(cur.five);
				Q.offer(cur.minus);
			}
			L++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		FindCalf T = new FindCalf();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		T.root = new Path(s);
		System.out.println(T.solution(e));
		sc.close();
	}
}
