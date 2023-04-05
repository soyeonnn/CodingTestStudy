import java.io.*;
import java.util.*;

public class Main_13458 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int roomCnt = Integer.parseInt(br.readLine());
        int[] room = new int[roomCnt];

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<roomCnt; i++) {
            room[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int firstDirector = Integer.parseInt(st.nextToken());
        int twoDirector = Integer.parseInt(st.nextToken());

        long answer = 0;
        for(int student : room) {
            answer++;
            student -= firstDirector;
            if(student <= 0) continue;  // 이게 없으면 틀림!!
            answer += student / twoDirector;
            if(student % twoDirector != 0) answer++;
        }

        System.out.println(answer);
    }
}
