import java.io.*;
import java.util.StringTokenizer;

public class Main_2979 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 주차 요금 입력받기
        int[] fee = new int[3];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<3; i++) {
            fee[i] = Integer.parseInt(st.nextToken());
        }

        // 트럭이 주차장이 도착한 시간, 떠난 시간 입력받기
        int[][] time = new int[3][2];
        int minTime = Integer.MAX_VALUE;
        int maxTime = Integer.MIN_VALUE;
        for(int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());
            time[i][0] = startTime;
            time[i][1] = endTime;
            minTime = Math.min(minTime, startTime);
            maxTime = Math.max(maxTime, endTime);
        }

        int answer = 0;
        for(int t=minTime; t<=maxTime; t++) {
            int cnt = 0;
            for(int i=0; i<3; i++) {
                int startTime = time[i][0];
                int endTime = time[i][1];
                if(startTime <= t && t < endTime) cnt++;
            }
            if(cnt > 0) answer += fee[cnt-1] * cnt;
        }

        System.out.println(answer);
    }
}
