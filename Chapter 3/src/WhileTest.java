public class WhileTest {
    public static void main(String args[]) {
        int sum = 0, sum2 = 0, i = 0;

        while (i < 100) {
            sum = sum + i;
            sum2 = sum2 + i/2;
            i += 2;
            System.out.printf("%d %d\n", sum, sum2);
        }
        System.out.println(sum);
    }
}
