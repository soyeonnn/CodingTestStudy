import java.util.*;
import java.io.*;
public class Main_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] words = new String[N];
        for(int i=0; i<N; i++) {
            words[i] = br.readLine();
        }

        int answer = 0;
        for(String word : words) {
            Stack<Character> s = new Stack<>();
            for(char c : word.toCharArray()) {
                if(s.isEmpty()) s.add(c);
                else {
                    if(s.peek() == c) s.pop();
                    else s.add(c);
                }
            }
            if(s.size() == 0) answer++;
        }

        System.out.println(answer);

    }
}
