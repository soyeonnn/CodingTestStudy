public class NewIDRecommendation {
    public String solution(String new_id) {
        String answer = "";

        // 1단계 대문자 -> 소문자로 변경
        answer = new_id.toLowerCase();

        // 2단계 - 소문자, 숫자, -, _, . 제외한 문자 제거
        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        // 3단계 - .. -> .
        int cnt = 0;
        String tmpAnswer = "";
        for (char x : answer.toCharArray()) {
            if (x == '.') {
                cnt++;
                if (cnt == 1)
                    tmpAnswer += x;
            } else {
                tmpAnswer += x;
                cnt = 0;
            }
        }
        answer = tmpAnswer;

        // 4단계 - 마침표가 처음이나 끝에 있으면 제거
        if (answer.charAt(0) == '.')
            answer = answer.substring(1);

        // 5단계 - 빈문자열이면 a 대입
        if (answer.length() == 0) answer += "a";

        // 6단계 - 16자 이상이면 문자 제외 . 마지막에 있으면 제거
        if (answer.length() >= 16)
            answer = answer.substring(0, 15);
        if (answer.charAt(answer.length() - 1) == '.')
            answer = answer.substring(0, answer.length() - 1);

        // 7단계 - 2자 이하인 경우
        while (answer.length() < 3)
            answer += answer.charAt(answer.length() - 1);

        return answer;
    }
}
