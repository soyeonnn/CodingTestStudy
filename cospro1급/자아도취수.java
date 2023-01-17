import java.util.Arrays;

class Main {
    public int power(int base, int exponent) {
        int val = 1;
        for (int i = 0; i < exponent; i++) 
            val *= base;
        return val;
    }
    public int[] solution(int k) {
        int range = power(10, k);
        int[] answer = new int[range];
        int count = 0;
        for (int i = range / 10; i < range; i++) {
            int current = i;
            int calculated = 0;
            while (current != 0) {
                calculated += power(current % 10, k);
                current /= 10;
            }
            if (calculated == i)
                answer[count++] = i;
        }

        int[] ret = new int[count];
        for (int i = 0; i < count; i++)
            ret[i] = answer[i];
        return ret;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int k = 3;
        int[] ret = sol.solution(k);

        System.out.printf("solution 메소드의 반환 값은 ");
        System.out.printf(Arrays.toString(ret));
        System.out.printf(" 입니다.\n");
    }   
}