import java.io.*;
import java.util.*;
public class Main_14891 {
    public static String rotate(int direction, String tooth) {
        String result = "";
        if(direction == 1) {
            result += tooth.charAt(tooth.length()-1);
            result += tooth.substring(0, tooth.length()-1);
        } else {
            result += tooth.substring(1, tooth.length());
            result += tooth.charAt(0);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int answer = 0;

        // 톱니바퀴 상태 저장
        String[] tooth = new String[5];
        for(int i=1; i<=4; i++) {
            tooth[i] = br.readLine();
        }

        // 회전시키는 방법 저장
        int rotationCnt = Integer.parseInt(br.readLine());
        int[] rotationToothNum = new int[rotationCnt];
        int[] rotationClock = new int[rotationCnt];
        for(int i=0; i<rotationCnt; i++) {
            st = new StringTokenizer(br.readLine());
            rotationToothNum[i] = Integer.parseInt(st.nextToken());
            rotationClock[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<rotationCnt; i++) {
            int toothNum = rotationToothNum[i];
            int clock = rotationClock[i];

            // 각 톱니바퀴가 회전 되어야 하는지 확인
            int[] toothRotate = new int[5];
            toothRotate[toothNum] = clock;
            for(int a=toothNum; a<4; a++) {
                if(tooth[a].charAt(2) != tooth[a+1].charAt(6)) toothRotate[a+1] = toothRotate[a] * -1;
            }
            for(int a=toothNum; a>1; a--) {
                if(tooth[a].charAt(6) != tooth[a-1].charAt(2)) toothRotate[a-1] = toothRotate[a] * -1;
            }

            // 회전 시키기
            for(int j=1; j<toothRotate.length; j++) {
                if(toothRotate[j] != 0) {
                    tooth[j] = rotate(toothRotate[j], tooth[j]);
                }
            }
        }

        for(int i=1; i<tooth.length; i++) {
            if(tooth[i].charAt(0)-48 == 1) {
                answer += Math.pow(2,i-1);
            }
        }

        System.out.println(answer);
    }
}
