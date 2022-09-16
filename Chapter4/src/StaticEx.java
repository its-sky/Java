class ArrayUtil {
    public static int [] concat(int a[], int b[]) {
        int len = a.length + b.length;
        int c[] = new int[len];
        int i, cnt = 0;
        for (i = 0; i < a.length; i++) {
            c[cnt] = a[i];
            ++cnt;
        }
        for (i = 0; i < b.length; i++) {
            c[cnt] = b[i];
            ++cnt;
        }
        return (c);
    }

    public static void print (int a[]) {
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.print("]");
    }
}

public class StaticEx {
    public static void main(String args[]) {
        int array1[] = { 1, 5, 7, 9 };
        int array2[] = { 3, 6, -1, 100, 77 };
        int array3[] = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}
