import java.util.*;
import java.io.*;
public class Main_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> words = new ArrayList<>();
        for(int i=0; i<N; i++) {
            String input = br.readLine();
            if(!words.contains(input)) words.add(input);
        }

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length()) return o1.length() - o2.length();
                else return o1.compareTo(o2);
            }
        });

        for(String word : words) System.out.println(word);
    }
}
