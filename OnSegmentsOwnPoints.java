import java.util.Scanner;

public class OnSegmentsOwnPoints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cnt = scan.nextInt();
        int alexyLeft = scan.nextInt(), alexyRight = scan.nextInt();
        int[] r = new int[101];
        for (int i = 1; i < cnt; i++) {
            r[scan.nextInt()]++;
            r[scan.nextInt()]--;
        }

        scan.close();

        int ret = 0, cur = 0;
        for (int i = 0; i < 101; i++) {
            cur += r[i];
            if (cur == 0 && i >= alexyLeft && i < alexyRight)
                ret++;
        }

        System.out.println(ret);
    }
}