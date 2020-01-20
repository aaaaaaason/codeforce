import java.util.Scanner;

public class BearBigBrother {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt(), b = scan.nextInt();
        int cnt = 0;

        while (l <= b) {
            l *= 3;
            b *= 2;
            cnt++;
        }

        System.out.println(cnt);
    }
}