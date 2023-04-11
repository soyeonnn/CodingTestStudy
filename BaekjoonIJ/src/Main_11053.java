import java.io.*;
import java.util.*;

public class Main_11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int[] lenCnt = new int[N];
        int answer = Integer.MIN_VALUE;
        lenCnt[0] = 1;
        for(int i=1; i<N; i++) {
            int max = Integer.MIN_VALUE;
            for(int j=i-1; j>=0; j--) {
                if(a[j] < a[i]) {
                    max = Math.max(max, lenCnt[j]);
                }
            }
            if(max == Integer.MIN_VALUE) lenCnt[i] = 1;
            else {
                lenCnt[i] = max+1;
                answer = Math.max(answer, lenCnt[i]);
            }
        }
        if(answer == Integer.MIN_VALUE) answer = 1;
        System.out.println(answer);
    }
}
