import java.util.*;

public class StringOfNumbersAndWords {
    public int solution(String s) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        String answerStr = "";
        String tmpStr = "";

        for(char x : s.toCharArray()) {
            if(Character.isDigit(x)) answerStr += x;
            else {
                tmpStr += x;
                if(map.containsKey(tmpStr)) {
                    answerStr += map.get(tmpStr);
                    tmpStr = "";
                }
            }
        }
        answer = Integer.parseInt(answerStr);
        return answer;
    }

    public static void main(String[] args) {
        StringOfNumbersAndWords T = new StringOfNumbersAndWords();
        System.out.println(T.solution("one4seveneight"));
        System.out.println(T.solution("23four5six7"));
    }
}
