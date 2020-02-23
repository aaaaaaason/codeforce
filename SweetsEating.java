import java.util.*;

public class SweetsEating {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = s.nextInt();
        Arrays.sort(a);

        long[] dp = new long[n]; dp[0] = a[0];
        for (int i = 1; i < m; i++) dp[i] = a[i] + dp[i-1];
        long pre = dp[m-1];
        for (int i = m; i < n; i++) {
            pre += a[i];
            dp[i] = pre + dp[i-m];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(Long.toString(dp[i]) + " ");
        System.out.println(sb.toString());
    }
}