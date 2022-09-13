import java.util.Scanner;

public class DynamicAlloc {
    public static boolean checkRedundant(int arr[], int idx) {
        for (int i = 0; i < idx; i++) {
            if (arr[i] == arr[idx])
                return false;
        }
        return true;
    }

    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 몇개?");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int i = 0;

        for (i = 0; i < n; i++) {
            arr[i] = (int)(Math.random()*100 + 1);
        }
        for (i = 0; i < n; i++) {
            if (checkRedundant(arr, i))
                System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
