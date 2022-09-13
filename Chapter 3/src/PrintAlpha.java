import java.util.Scanner;

public class PrintAlpha {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        char c = scanner.next().charAt(0);
        for (char i = 'a'; i <= c; i++) {
            for (char j = i; j <= c; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
