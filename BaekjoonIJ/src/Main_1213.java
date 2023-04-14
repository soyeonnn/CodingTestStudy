import java.util.*;
import java.io.*;
public class Main_1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Character, Integer> tM = new TreeMap<>(Collections.reverseOrder());
        String input = br.readLine();
        for(char c : input.toCharArray()) {
            tM.put(c, tM.getOrDefault(c, 0)+1);
        }

        int oddCnt = 0;
        char oddC = ' ';
        for(char c : tM.keySet()) {
            if(tM.get(c) % 2 == 1) {
                oddCnt++;
                oddC = c;
            }
        }

        LinkedList<Character> tmp = new LinkedList<>();
        if(oddCnt > 1) System.out.println("I'm Sorry Hansoo");
        else {
            if(oddCnt == 1) {
                tmp.add(oddC);
                tM.put(oddC, tM.get(oddC)-1);
            }
            for(char c : tM.keySet()) {
                while(tM.get(c) > 0) {
                    tmp.addFirst(c);
                    tmp.addLast(c);
                    tM.put(c, tM.get(c)-2);
                }
            }
        }

        for(char c : tmp) System.out.print(c);
    }
}
