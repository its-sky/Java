import java.util.Scanner;

public class Exchange {
    public static void main(String args[]) {
        int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int won = scanner.nextInt();
        int i = 0;
        int cnt = 0;

        while (won > 0) {
            if (won < unit[i]) {
                ++i;
                continue;
            }
            cnt = won / unit[i];
            System.out.printf("%d원 짜리 : %d개\n", unit[i], cnt);
            won %= unit[i];
            ++i;
        }
        scanner.close();
    }
}
