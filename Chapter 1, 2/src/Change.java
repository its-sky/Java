import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int won = scanner.nextInt();
        if (won >= 50000) {
            System.out.println("오만원권 " + (won / 50000) + "매");
            won = won % 50000;
        }
        if (won >= 10000) {
            System.out.println("만원권 " + (won / 10000) + "매");
            won = won % 10000;
        }
        if (won >= 1000) {
            System.out.println("오만원권 " + (won / 1000) + "매");
            won = won % 1000;
        }
        if (won >= 100) {
            System.out.println("백원 " + (won / 100) + "개");
            won = won % 100;
        }
        if (won >= 50) {
            System.out.println("오만원권 " + (won / 50) + "개");
            won = won % 50;
        }
        if (won >= 10) {
            System.out.println("오만원권 " + (won / 10) + "개");
            won = won % 10;
        }
        if (won >= 1) {
            System.out.println("오만원권 " + won + "개");
        }
        scanner.close();
    }
}
