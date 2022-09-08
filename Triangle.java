import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개를 입력하시오>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a + b > c) && (b + c) > a && (a + c) > b)
            System.out.println("삼각형이 됩니다");
        else
            System.out.println("삼각형이 안됩니다");
        scanner.close();
    }
}
