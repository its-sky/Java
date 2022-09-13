import java.util.Scanner;

public class PrintStar {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하시오>>");
        int n = scanner.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
