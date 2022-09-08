import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산>>");
        int a = scanner.nextInt();
        char op = scanner.next().charAt(0);
        int b = scanner.nextInt();

        if (op == '+')
            System.out.printf("%d+%d의 결과는 %d", a, b, a+b);
        else if (op == '-')
            System.out.printf("%d-%d의 결과는 %d", a, b, a-b);
        else if (op == '*')
            System.out.printf("%d*%d의 결과는 %d", a, b, a*b);
        else if (op == '/') {
            if (b == 0)
                System.out.println("0으로 나눌 수 없습니다.");
            else
                System.out.printf("%d/%d의 결과는 %d", a, b, a / b);
        }
        scanner.close();
    }
}
