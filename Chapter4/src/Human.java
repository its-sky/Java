public class Human {
    String name;
    int age;
    double height;
    double weight;

    public Human(String s) {
        name = s;
    }

    public static void printHuman(Human h) {
        System.out.printf("%s %d %.1f %.1f", h.name, h.age, h.height, h.weight);
    }

    public static void main(String args[]) {
        Human h = new Human("홍길동");
        h.age = 21;
        h.height = 180.5;
        h.weight = 73.2;

        printHuman(h);
    }
}
