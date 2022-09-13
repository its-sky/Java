public class RandomPicker {

    public static boolean isZero(int n[][], int tmp_x, int tmp_y) {
        if (n[tmp_x][tmp_y] == 0) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int n[][] = new int[4][4];
        int max = 10, i = 0;
        int tmp_x = 0;
        int tmp_y = 0;

        while (i < max) {
            tmp_x = (int)(Math.random()*3 + 1);
            tmp_y = (int)(Math.random()*3 + 1);
            if (isZero(n, tmp_x, tmp_y)) {
                n[tmp_x][tmp_y] = (int) (Math.random() * 10) + 1;
                System.out.printf("%d %d\n", tmp_x, tmp_y);
                ++i;
            }
        }
        for (i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-5d", n[i][j]);
            }
            System.out.println();
        }
    }
}
