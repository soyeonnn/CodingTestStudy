import java.util.*;
import java.io.*;
public class Main_20413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] standard = new int[5];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<standard.length; i++) {
            standard[i] = Integer.parseInt(st.nextToken());
        }
        String play = br.readLine();
        int[] playMoney = new int[play.length()];
        int answer = 0;
        if(play.charAt(0) == 'B') playMoney[0] = standard[1] - 1;
        else if(play.charAt(0) == 'S') playMoney[0] = standard[2] - 1;
        else if(play.charAt(0) == 'G') playMoney[0] = standard[3] - 1;
        else if(play.charAt(0) == 'P') playMoney[0] = standard[4] - 1;
        else if(play.charAt(0) == 'D') playMoney[0] = standard[4];
        answer += playMoney[0];

        for(int i=1; i<play.length(); i++) {
            if(play.charAt(i) == 'B') playMoney[i] = (standard[1]-1) - playMoney[i-1];
            else if(play.charAt(i) == 'S') playMoney[i] = (standard[2]-1) - playMoney[i-1];
            else if(play.charAt(i) == 'G') playMoney[i] = (standard[3]-1) - playMoney[i-1];
            else if(play.charAt(i) == 'P') playMoney[i] =  (standard[4]-1) - playMoney[i-1];
            else if(play.charAt(i) == 'D') playMoney[i] =  standard[4];
            answer += playMoney[i];
        }
        
        System.out.println(answer);

    }
}
