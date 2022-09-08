import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("더하기를 할 두 숫자를 입력하세요");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println("두 수의 합은 " + (a + b) + "입니다.");
    }
}
