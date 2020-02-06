import java.util.Scanner;
import java.util.Arrays;

public class TheLeastRoundWay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[][] arr = new int[n+1][n+1];
        boolean hasZero = false;
        int zi = -1, zj = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i+1][j+1] = s.nextInt();
                if (!hasZero && arr[i+1][j+1] == 0) {
                    hasZero = true;
                    zi = i;
                    zj = j;
                }
            }
        }

        String[] tr = findMin(arr, n, 2);
        String[] fr = findMin(arr, n, 5);
        int tv = Integer.valueOf(tr[0]), fv = Integer.valueOf(fr[0]);
        if (hasZero && Math.min(tv, fv) > 1) {
            System.out.println(1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < zi; i++)
                sb.append('D');
            for (int j = 0; j < zj; j++)
                sb.append('R');
            for (int i = zi+1; i < n; i++)
                sb.append('D');
            for (int j = zj+1; j < n; j++)
                sb.append('R');
            System.out.println(sb.toString());
        } else if (tv < fv) {
            System.out.println(tr[0]);
            System.out.println(tr[1]);
        } else {
            System.out.println(fr[0]);
            System.out.println(fr[1]);
        }
    }

    private static String[] findMin(int[][] m, int n, int k) {
        int[][] dp = new int[n+1][n+1];
        char[][] path = new char[n+1][n+1];

        for (int i = 0; i < n; i++) {
            dp[i+1][1] = dp[i][1] + countDivisor(m[i+1][1], k);
            path[i+1][1] = 'D';
        }

        for (int j = 1; j < n; j++) {
            dp[1][j+1] = dp[1][j] + countDivisor(m[1][j+1], k);
            path[1][j+1] = 'R';
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int up = dp[i][j+1];
                int left = dp[i+1][j];
                dp[i+1][j+1] += countDivisor(m[i+1][j+1], k);
                if (up <= left) {
                    dp[i+1][j+1] += up;
                    path[i+1][j+1] = 'D';
                } else {
                    dp[i+1][j+1] += left;
                    path[i+1][j+1] = 'R';
                }
            }
        }

        /*
        for (int i = 0; i <= n; i++)
            System.out.println(Arrays.toString(dp[i]));
        for (int i = 0; i <= n; i++)
            System.out.println(Arrays.toString(path[i]));
        System.out.println("---");
        */

        String[] ret = new String[2];
        ret[0] = Integer.toString(dp[n][n]);
        StringBuilder sb = new StringBuilder();
        int i = n, j = n;
        while (i != 1 || j != 1) {
            sb.append(path[i][j]);
            if (path[i][j] == 'D')
                i--;
            else
                j--;
        }
        ret[1] = sb.reverse().toString();
        return ret;
    }

    private static int countDivisor(int num, int k) {
        if (num == 0) return 0;

        int cnt = 0;
        while (num % k == 0) {
            cnt++;
            num /= k;
        }
        return cnt;
    }
}