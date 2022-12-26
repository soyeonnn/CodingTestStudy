package recursivetreegraph;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathEndBfs {

	Node root;
	
	public int BFS(int L, Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				Node cur = Q.poll();		
				if(cur.lt == null && cur.rt == null) return L;
				Q.offer(cur.lt);
				Q.offer(cur.rt);
			}
			L++;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		ShortestPathEndBfs tree = new ShortestPathEndBfs();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.BFS(0, tree.root));
	}
}
