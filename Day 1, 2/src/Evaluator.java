import java.util.Scanner;

public class Evaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("2자리수 정수 입력(10~99)>>");
        int num = scanner.nextInt();
        if (num / 10 == num % 10) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        scanner.close();
    }
}
