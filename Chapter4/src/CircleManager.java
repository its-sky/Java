import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show() {
        System.out.println("(" + this.x + "," + this.y + ")" + this.radius);
    }

    public double circleArea() {
        return 3.14*this.radius*this.radius;
    }
}

public class CircleManager {
    public static void biggestCircle(Circle c[]) {
        double maxArea = 0.0;
        int tmp = 0;

        for (int i = 0; i < c.length; i++) {
           if (maxArea <c[i].circleArea()) {
               maxArea = c[i].circleArea();
               tmp = i;
           }
        }
        System.out.print("가장 면적이 큰 원은 ");
        c[tmp].show();
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Circle c[] = new Circle[3];
        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x, y, radius);
        }
        biggestCircle(c);
        scanner.close();
    }
}
