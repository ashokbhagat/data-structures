/*
 * Array Reversal
 */
public class ArraysReverse {

    public static void main(String[] args) {
        reverseArray();
    }

    private static void reverseArray() {
        int a[] = { 1, 2, 3, 4, 5 };
        print(a);

        for (int i = 0; i < (a.length / 2); i++) {
            int temp = a[i];
            a[i] = a[(a.length - 1) - i];
            a[(a.length - 1) - i] = temp;
        }

        print(a);

    }

    private static void print(int[] a) {
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}