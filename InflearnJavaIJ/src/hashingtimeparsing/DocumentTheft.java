package hashingtimeparsing;

import java.util.*;

class Report implements Comparable<Report> {
    String name;
    int hour;
    int minute;

    public Report(String name, int hour, int minute) {
        this.name = name;
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public int compareTo(Report o) {
        if(this.hour == o.hour) return this.minute - o.minute;
        return this.hour - o.hour;
    }
}

public class DocumentTheft {

    public String[] solution(String[] reports, String times){
        String[] answer;
        ArrayList<Report> reportsArr = new ArrayList<>();
        int sH = Integer.parseInt(times.split(" ")[0].split(":")[0]);
        int sM = Integer.parseInt(times.split(" ")[0].split(":")[1]);
        int start = sH * 60 + sM;
        int eH = Integer.parseInt(times.split(" ")[1].split(":")[0]);
        int eM = Integer.parseInt(times.split(" ")[1].split(":")[1]);
        int end = eH * 60 + eM;

        for(String report : reports) {
            String[] reportSplit = report.split(" ");
            String name = reportSplit[0];
            String[] time = reportSplit[1].split(":");
            int hour = Integer.parseInt(time[0]);
            int minute = Integer.parseInt(time[1]);
            reportsArr.add(new Report(name, hour, minute));
        }

        Collections.sort(reportsArr);

        ArrayList<String> answerTmp = new ArrayList<>();
        for(Report report : reportsArr) {
            String name = report.name;
            int hour = report.hour;
            int minute = report.minute;
            int time = hour * 60 + minute;

            if(start <= time && time <= end) answerTmp.add(name);
        }

        answer = answerTmp.toArray(new String[answerTmp.size()]);
        return answer;
    }

    public static void main(String[] args){
        DocumentTheft T = new DocumentTheft();
        System.out.println(Arrays.toString(T.solution(new String[]{"john 15:23", "daniel 09:30", "tom 07:23", "park 09:59", "luis 08:57"}, "08:33 09:45")));
        System.out.println(Arrays.toString(T.solution(new String[]{"ami 12:56", "daniel 15:00", "bob 19:59", "luis 08:57", "bill 17:35", "tom 07:23", "john 15:23", "park 09:59"}, "15:01 19:59")));
        System.out.println(Arrays.toString(T.solution(new String[]{"cody 14:20", "luis 10:12", "alice 15:40", "tom 15:20", "daniel 14:50"}, "14:20 15:20")));
    }
}
