import java.util.*;
import java.io.*;
public class Main_14888 {

    static int[] nums, operators, numCh, operatorCh;
    static LinkedList<Integer> tmp;
    static int N, max, min;

    public static void dfs(int n, String s) {
        if(n == N-1) {
            int operCur = 0;
            Stack<Integer> numTmp = new Stack<>();
            numTmp.add(nums[0]);
            int i=1;
            while(i<=N-1) {
                if(tmp.size() == 0) break;
                int oper = s.charAt(operCur) - 48;
                operCur++;
                numTmp.add(nums[i++]);
                int n1 = numTmp.pop();
                int n2 = numTmp.pop();
                int resultTmp = 0;
                switch(oper) {
                    case 0:
                        resultTmp = n2 + n1;
                        break;
                    case 1:
                        resultTmp = n2 - n1;
                        break;
                    case 2:
                        resultTmp = n2 * n1;
                        break;
                    case 3:
                        resultTmp = n2 / n1;
                }
                numTmp.add(resultTmp);
            }
            int result = numTmp.pop();
            max = Math.max(max, result);
            min = Math.min(min, result);

        } else {
            for(int i=0; i<N-1; i++) {
                if(operatorCh[i] == 0) {
                    operatorCh[i] = 1;
                    tmp.add(operators[i]);
                    dfs(n+1, s+operators[i]);
                    operatorCh[i] = 0;
                    tmp.pollLast();
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력받기
        N = Integer.parseInt(br.readLine());
        nums = new int[N];
        int[] operatorsInt = new int[4];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) nums[i] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++) operatorsInt[i] = Integer.parseInt(st.nextToken());

        operators = new int[N-1];
        int cur = 0;
        for(int i=0; i<4; i++) {
            if(operatorsInt[i] != 0) {
                for(int j=0; j<operatorsInt[i]; j++) {
                    operators[cur] = i;
                    cur++;
                }
            }
        }

        numCh = new int[N];
        operatorCh = new int[N-1];
        tmp = new LinkedList<>();
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        dfs(0, "");
        System.out.println(max);
        System.out.println(min);
    }
}
