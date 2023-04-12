import java.util.*;
import java.io.*;
public class Main_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 도감에 등록된 포켓문 개수, 맞춰야 할 문제 입력받기
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 번호, 이름으로 저장할 도감 2개 생성
        HashMap<Integer, String> num = new HashMap<>();
        HashMap<String, Integer> name = new HashMap<>();

        // 도감에 포켓몬 등록
        for(int i=1; i<=N; i++) {
            String pokemon = br.readLine();
            name.put(pokemon, i);
            num.put(i, pokemon);
        }

        // 맞춰야 할 문제 입력받기
        String[] quizes = new String[M];
        for(int i=0; i<M; i++) {
            quizes[i] = br.readLine();
        }

        // 숫자인지 문자열인지에 따라 각 도감에서 가져오기
        for(String quiz : quizes) {
            try {
                System.out.println(num.get(Integer.parseInt(quiz)));
            } catch(NumberFormatException e) {
                System.out.println(name.get(quiz));
            }
        }
    }
}
