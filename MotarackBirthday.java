import java.util.*;

public class MotarackBirthday {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = s.nextInt();
        for (int c = 0; c < total; c++) {
            int len = s.nextInt();
            int[] arr = new int[len];
            for (int i = 0; i < len; i++)
                arr[i] = s.nextInt();

            HashSet<Integer> hs = new HashSet<>();
            int diff = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            for (int i = 0; i < len-1; i++) {
                if (arr[i] != -1 && arr[i+1] != -1)
                    diff = Math.max(diff, Math.abs(arr[i+1] - arr[i]));
                else if (arr[i] != -1) {
                    max = Math.max(max, arr[i]);
                    min = Math.min(min, arr[i]);
                } else if (arr[i+1] != -1) {
                    max = Math.max(max, arr[i+1]);
                    min = Math.min(min, arr[i+1]);
                }
            }

            int k = (max + min) / 2;
            diff = Math.max(diff, Math.max(max - k, k - min));

            System.out.printf("%d %d\n", diff, k);

        }
    }
}