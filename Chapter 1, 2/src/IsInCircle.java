import java.util.Scanner;

public class IsInCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원의 중심과 반지름 입력>>");
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();
        float r = scanner.nextFloat();
        System.out.print("점 입력>>");
        float x1 = scanner.nextFloat();
        float y1 = scanner.nextFloat();

        if (Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2)) <= r)
            System.out.printf("점(%.1f, %.1f)는 원 안에 있다.", x1, y1);
        else
            System.out.printf("점(%.1f, %.1f)는 원 안에 없다.", x1, y1);
        scanner.close();
    }
}
