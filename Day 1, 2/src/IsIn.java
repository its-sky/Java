import java.util.Scanner;

public class IsIn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점 (x,y)의 좌표를 입력하시오>>");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x >= 100 && x <= 200) {
            if (y >= 100 && y <= 200)
                System.out.printf("(%d,%d)는 사각형 안에 있습니다.", x, y);
            else
                System.out.println("사각형 안에 없습니다.");
        }
        else
            System.out.println("사각형 안에 없습니다.");
        scanner.close();
    }
}
