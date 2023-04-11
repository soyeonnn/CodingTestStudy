import java.util.*;
import java.io.*;
public class Main_1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> hM = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            String lastName = br.readLine();
            hM.put(lastName.charAt(0), hM.getOrDefault(lastName.charAt(0), 0) + 1);
        }

        boolean flag = false;
        for(char c : hM.keySet()) {
            if(hM.get(c) >= 5) {
                System.out.print(c);
                flag = true;
            }
        }

        if(!flag) System.out.println("PREDAJA");
    }
}
