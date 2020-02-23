import java.util.*;

public class GoodNumbersHard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        long[] dp = new long[64]; dp[0] = 1;
        for (int i = 1; i < 64; i++) {
            dp[i] = 3 * dp[i-1];
            if (Long.MAX_VALUE - dp[i] - dp[i] < dp[i]) break;
        }

        for (int t = 0; t < tc; t++) {
            int[] arr = new int[64];
            long cur = s.nextLong();
            int i = 0;
            while (cur > 0) {
                arr[i++] = (int)(cur % 3);
                cur /= 3;
            }

            long r = 0;
            while (i >= 0) {
                //System.out.println(r);
                if (arr[i] == 2) {
                    int j = i + 1;
                    while (arr[j] != 0) {
                        if (arr[j] == 1) r -= dp[j];
                        j++;
                    }
                    r += dp[j];
                    break;
                } else if (arr[i] == 1) {
                    r += dp[i];
                }
                i--;
            }

            System.out.println(r);
        }
    }
}