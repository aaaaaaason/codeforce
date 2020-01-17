import java.util.Scanner;

public class InnaAlarmClock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int clkNum = scan.nextInt();
        int[][] clkCord = new int[clkNum][2];
        for (int i = 0; i < clkNum; i++) {
            clkCord[i][0] = scan.nextInt();
            clkCord[i][1] = scan.nextInt();
        }

        scan.close();

        boolean[] v = new boolean[101], h = new boolean[101];
        int vCnt = 0, hCnt = 0;
        for (int[] c: clkCord) {
            if (!h[c[0]]) {
                hCnt++;
                h[c[0]] = true;
            }

            if (!v[c[1]]) {
                vCnt++;
                v[c[1]] = true;
            }
        }

        System.out.println(Math.min(vCnt, hCnt));
    }
}