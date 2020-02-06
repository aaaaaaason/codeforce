import java.util.Scanner;

public class FridgeLockers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        for (int i = 0; i < cases; i++) {
            int n = s.nextInt(), m = s.nextInt();
            int[] w = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                w[j] = s.nextInt();
                sum += w[j];
            }

            if (n == 2 || m < n) {
                System.out.println(-1);
                continue;
            }

            System.out.println(sum*2);
            for (int j = 1; j <= n; j++) {
                int next = j + 1;
                if (next > n) next = 1;
                System.out.println(j + " " + next);
            }
        }

    }
}