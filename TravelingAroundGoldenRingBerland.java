import java.util.*;

public class TravelingAroundGoldenRingBerland {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = s.nextInt();

        int max = Integer.MIN_VALUE, maxIdx = -1;
        for (int i = a.length - 1; i >= 0; i--) {
            if (max < a[i]) {
                max = a[i];
                maxIdx = i;
            }
        }

        if (max == 0) {
            System.out.println(1);
            return;
        } else {
            long ret = ((long) max-1) * ((long)n) + (long)(maxIdx+1);
            System.out.println(ret);
        }

        s.close();
    }
}