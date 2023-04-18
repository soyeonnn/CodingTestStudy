package hashingtimeparsing;

import java.util.*;

public class AlertMail {
    public int getTime(String time) {
        int h = Integer.parseInt(time.split(":")[0]);
        int m = Integer.parseInt(time.split(":")[1]);

        return h * 60 + m;
    }

    public String[] solution(String[] reports, int time){
        String[] answer = {};
        ArrayList<String> answerTmp = new ArrayList<>();
        HashMap<String, ArrayList<Integer>> hM = new HashMap<>();

        for(String report : reports) {
            String name = report.split(" ")[0];
            String timeStr = report.split(" ")[1];
            String state = report.split(" ")[2];

            if(state.equals("in")) {
                hM.put(name, hM.getOrDefault(name, new ArrayList<>()));
                hM.get(name).add(getTime(timeStr));
            } else {
                int t = getTime(timeStr) - hM.get(name).get(hM.get(name).size()-1);
                hM.get(name).remove(hM.get(name).size()-1);
                hM.get(name).add(t);
            }

        }

        for(String name : hM.keySet()){
            int sum = 0;
            for(int n : hM.get(name)) sum += n;
            if(sum > time) answerTmp.add(name);
        }

        answer = answerTmp.toArray(new String[answerTmp.size()]);
        return answer;
    }

    public static void main(String[] args){
        AlertMail T = new AlertMail();
        System.out.println(Arrays.toString(T.solution(new String[]{"john 09:30 in", "daniel 10:05 in", "john 10:15 out", "luis 11:57 in", "john 12:03 in", "john 12:20 out", "luis 12:35 out", "daniel 15:05 out"}, 60)));
        System.out.println(Arrays.toString(T.solution(new String[]{"bill 09:30 in", "daniel 10:00 in", "bill 11:15 out", "luis 11:57 in", "john 12:03 in", "john 12:20 out", "luis 14:35 out", "daniel 14:55 out"}, 120)));
        System.out.println(Arrays.toString(T.solution(new String[]{"cody 09:14 in", "bill 09:25 in", "luis 09:40 in", "bill 10:30 out", "cody 10:35 out", "luis 10:35 out", "bill 11:15 in", "bill 11:22 out", "luis 15:30 in", "luis 15:33 out"}, 70)));
        System.out.println(Arrays.toString(T.solution(new String[]{"chato 09:15 in", "emilly 10:00 in", "chato 10:15 out", "luis 10:57 in", "daniel 12:00 in", "emilly 12:20 out", "luis 11:20 out", "daniel 15:05 out"}, 60)));
    }
}
