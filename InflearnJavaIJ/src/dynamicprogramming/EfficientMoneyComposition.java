package dynamicprogramming;

import java.util.*;
import java.io.*;
public class EfficientMoneyComposition {

    public static void main(String[] args) throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(sb.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] dp = new int[101];
        ArrayList<Integer> token = new ArrayList<>();
        int minToken = Integer.MAX_VALUE;
        for(int i=0; i<N; i++) {
            token.add(Integer.parseInt(sb.readLine()));
            minToken = Math.min(minToken, token.get(i));
            dp[token.get(i)] = 1;
        }

        for(int i=minToken; i<=M; i++) {
            if(token.contains(i)) continue;
            int min = Integer.MAX_VALUE;
            boolean flag = false;
            for(int j=0; j<N; j++) {
                if(i-token.get(j) <= 0 || dp[i-token.get(j)] == 0) continue;
                min = Math.min(min, dp[i-token.get(j)]);
                flag = true;
            }
            if(flag) dp[i] = min + 1;
        }

        if(dp[M] == 0) System.out.println(-1);
        else System.out.println(dp[M]);

    }
}
