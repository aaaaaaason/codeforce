import java.util.Scanner;
import java.util.Arrays;

public class RedBlueBalls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); scan.nextLine();
        String line = scan.nextLine();
        scan.close();

        long ret = 0;
        for (int i = n-1; i >= 0; i--) {
            if (line.charAt(i) == 'B')
                ret = (ret << 1) + 1;
            else
                ret <<= 1;
        }

        /*
        int[] stk = new int[n];
        int top = 0, blueCnt = 0;
        for (int i = n-1; i >= 0; i--) {
            if (line.charAt(i) == 'B') {
                stk[top] = 1;
                blueCnt++;
            }
            top++;
        }

        //system.out.println(arrays.tostring(stk));

        int ret = 0;
        while (blueCnt > 0) {
            while (stk[top-1] == 0) {
                stk[top-1] = 1;
                blueCnt++;
                top--;
            }

            if (stk[top-1] == 1) {
                stk[top-1] = 0;
                blueCnt--;
            }

            top = n;
            ret++;

            //System.out.println(Arrays.toString(stk));
        }
        */

        System.out.println(ret);
    }
}