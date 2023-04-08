package dynamicprogramming;

import java.io.*;
import java.util.*;

public class EfficientMoneyCompositionSolution {

    public static void main(String[] args) throws IOException {
        BufferedReader sb = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(sb.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        // 화폐 정보 입력 받기
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(sb.readLine());
        }

        int[] d = new int[M+1]; // dp 테이블 초기화
        Arrays.fill(d, 10001);
        d[0] = 0;
        for(int i=0; i<N; i++) {
            for(int j=arr[i]; j<=M; j++) {
                if(d[j-arr[i]] != 10001) {
                    d[j] = Math.min(d[j], d[j-arr[i]] + 1);
                }
            }
        }

        if(d[M] == 10001) System.out.println(-1);
        else System.out.println(d[M]);

    }
}
