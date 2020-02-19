import java.util.*;

public class NewYearAndAscentSequence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] front = new int[n];
        int[] back = new int[1000002];
        for (int i = 0; i < n; i++) {
            int l = s.nextInt(), min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            boolean hasAsc = false;
            for (int j = 0; j < l ; j++) {
                int tmp = s.nextInt();
                if (tmp > min) hasAsc = true;
                min = Math.min(min, tmp);
                max = Math.max(max, tmp);
            }

            if (hasAsc) {
                front[i] = -1;
                back[1000001]++;
            } else {
                front[i] = min;
                back[max]++;
            }
        }

        for (int i = 1000000; i >= 0; i--)
            back[i] += back[i+1];

        long ret = 0;
        for (int f: front) {
            if (f == -1) ret += n;
            else ret += back[f+1];
        }

        System.out.println(ret);
    }
}