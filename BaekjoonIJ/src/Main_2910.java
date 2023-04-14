import java.util.*;
import java.io.*;
public class Main_2910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> hM = new LinkedHashMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            hM.put(num, hM.getOrDefault(num, 0) + 1);
        }

        List<Integer> keySet = new ArrayList<>(hM.keySet());
        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return hM.get(o2) - hM.get(o1);
            }
        });

        for(int n : keySet) {
            for(int i=0; i<hM.get(n); i++) System.out.print(n + " ");
        }

    }
}
