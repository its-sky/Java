
class Circler {
    int radius;
    public Circler(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14*radius*radius;
    }
}

public class CircleArray {
    public static void main(String args[]) {
        Circler c[] = new Circler[5];

        for (int i = 0; i < c.length; i++) {
            c[i] = new Circler(i);
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print((int)(c[i].getArea()) + " ");
        }
    }
}
