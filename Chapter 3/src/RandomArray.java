public class RandomArray {
    public static void main(String args[]) {
        int n[][] = new int[4][4];
        int i = 0, j = 0;
        
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                n[i][j] = (int)(Math.random() * 10 + 1);
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.printf("%-5d", n[i][j]);
            }
            System.out.println();
        }
    }
}
