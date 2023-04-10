import java.util.*;
import java.io.*;
public class Main_10815 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<Integer, Boolean> hM = new HashMap<>();

        // 상근이가 가진 카드 수 입력받기
        int N = Integer.parseInt(br.readLine());

        // 카드 수 만큼 카드 입력받기
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int card = Integer.parseInt(st.nextToken());
            hM.put(card, hM.getOrDefault(card, true));
        }

        // 비교해야 할 카드 수 입력받기
        int M = Integer.parseInt(br.readLine());

        // 상근이가 가지고 있는지 확인
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++) {
            int card = Integer.parseInt(st.nextToken());
            if(hM.containsKey(card)) System.out.print(1 + " ");
            else System.out.print(0 + " ");
        }
    }
}
