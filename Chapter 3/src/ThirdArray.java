import java.util.Scanner;

public class ThirdArray {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("양의 정수 10개를 입력하시오>>");
        int n[] = new int[10];
        int i = 0;
        for (i = 0; i < 10; i++) {
            n[i] = scanner.nextInt();
        }
        for (i = 0; i < 10; i++) {
            if (n[i] % 3 == 0)
                System.out.print(n[i] + " ");
        }
        scanner.close();
    }
}
