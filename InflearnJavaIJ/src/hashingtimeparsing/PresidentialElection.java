package hashingtimeparsing;

import java.util.*;
public class PresidentialElection {

    public String solution(String[] votes, int k){
        String answer = " ";
        HashMap<String, ArrayList<String>> hM = new HashMap<>();
        for(String vote : votes) {
            String[] voteSplit = vote.split(" ");
            ArrayList<String> tmp = hM.getOrDefault(voteSplit[1], new ArrayList<>());
            tmp.add(voteSplit[0]);
            hM.put(voteSplit[1], tmp);
        }

        TreeMap<String, Integer> present = new TreeMap<>();
        for(String key : hM.keySet()) {
            if(hM.get(key).size() >= k) {
                ArrayList<String> tmp = hM.get(key);
                for(String name : tmp) {
                    present.put(name, present.getOrDefault(name, 0) + 1);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(String key : present.keySet()) {
            if(present.get(key) > max) {
                max = present.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        PresidentialElection T = new PresidentialElection();
        System.out.println(T.solution(new String[]{"john tom", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
        System.out.println(T.solution(new String[]{"john tom", "park luis", "john luis", "luis tom", "park tom", "luis john", "luis park", "park john", "john park", "tom john", "tom park", "tom luis"}, 2));
        System.out.println(T.solution(new String[]{"cody tom", "john tom", "cody luis", "daniel luis", "john luis", "luis tom", "daniel tom", "luis john"}, 2));
        System.out.println(T.solution(new String[]{"bob tom", "bob park", "park bob", "luis park", "daniel luis", "luis bob", "park luis", "tom bob", "tom luis", "john park", "park john"}, 3));
    }
}
