public class RandomNum {
    public static void main(String args[]) {
        int n[] = new int[10];
        int i = 0, sum = 0;

        for (i = 0; i < 10; i++)
            n[i] = (int)(Math.random()*10 + 1);
        System.out.print("랜덤한 정수들 : ");
        for (i = 0; i < 10; i++) {
            System.out.print(n[i] + " ");
            sum += n[i];
        }
        System.out.printf("\n평균은 %.1f\n", (float)sum / 10);
    }
}
