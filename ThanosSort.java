import java.util.Scanner;

public class ThanosSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = scan.nextInt();
        System.out.println(sort(arr, 0, size));
        scan.close();
    }

    private static int sort(int[] arr, int i, int j) {
        if (j <= i) return 0;
        else if (j - i == 1) return 1;

        boolean isSort = true;
        for (int x = i+1; x < j; x++) {
            if (arr[x] < arr[x-1]) {
                isSort = false;
                break;
            }
        }

        if (isSort) return j - i;

        int mid = i + (j-i)/2;
        return Math.max(sort(arr, i, mid),
                        sort(arr, mid, j));

    }
}