import java.util.*;
import java.io.*;
public class Main_1717 {
    public static int[] root;

    public static int find(int x) {
        if(root[x] == x) return x;
        return root[x] = find(root[x]);
    }

    public static void union(int x, int y) {
        int a = find(x);
        int b = find(y);

        if (a != b) {
            if (a < b) {
                root[b] = a;
            } else {
                root[a] = b;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 초기화
        root = new int[n+1];
        for(int i=0; i<=n; i++) root[i] = i;

        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(type == 1) {
                if(find(a) == find(b)) System.out.println("YES");
                else System.out.println("NO");
            } else {
                union(a, b);
            }
        }
    }
}
