package dfs;

import java.util.*;

public class NearestLargestNum {

    static int ch[], numList[];
    static int len, num;
    static String tmpNum = "";
    static ArrayList<Integer> largeNum = new ArrayList<>();

    public void DFS(int n) {
        if(n == len) {
            if(Integer.parseInt(tmpNum) > num) largeNum.add(Integer.parseInt(tmpNum));
        } else {
            for(int i=0; i<len; i++) {
                if(ch[i] == 1) continue;
                ch[i] = 1;
                tmpNum += numList[i];
                DFS(n+1);
                tmpNum = tmpNum.substring(0, tmpNum.length()-1);
                ch[i] = 0;
            }
        }
    }

    public int solution(int n){
        num = n;
        int answer = 0;
        len = Integer.toString(n).length();
        numList = new int[len];
        for(int i=numList.length-1; i>=0; i--) {
            numList[i] = n % 10;
            n /= 10;
        }
        ch = new int[len];
        DFS(0);
        Collections.sort(largeNum);
        if(largeNum.size() == 0) answer = -1;
        else answer = largeNum.get(0);
        largeNum.clear();
        return answer;
    }

    public static void main(String[] args){
        NearestLargestNum T = new NearestLargestNum();
        System.out.println(T.solution(123));
        System.out.println(T.solution(321));
        System.out.println(T.solution(20573));
        System.out.println(T.solution(27711));
        System.out.println(T.solution(54312));
    }
}
