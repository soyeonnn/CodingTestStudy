class Main {
    public int solution(int money) {
        int coin[] = {10, 50, 100, 500, 1000, 5000, 10000, 50000};
        int counter = 0;
        int idx = coin.length - 1;
        while (money > 0){
            counter += money / coin[idx];
            money %= coin[idx];
            idx -= 1;
        }
        return counter;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int money = 2760;
        int ret = sol.solution(money);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}