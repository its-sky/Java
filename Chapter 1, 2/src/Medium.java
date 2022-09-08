import java.util.Scanner;

public class Medium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개 입력>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c) {
            if (b > c)
                System.out.println("중간 값은 " + b);
            else
                System.out.println("중간 값은 " + c);
        }
        else if (b > a && b > c) {
            if (a > c)
                System.out.println("중간 값은 " + a);
            else
                System.out.println("중간 값은 " + c);
        }
        else if (c > a && c > b) {
            if (a > b)
                System.out.println("중간 값은 " + a);
            else
                System.out.println("중간 값은 " + b);
        }
        scanner.close();
    }
}
