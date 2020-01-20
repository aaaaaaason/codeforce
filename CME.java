import java.util.Scanner;

public class CME {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        for (int i = 0; i < cnt; i++) {
            int cur = scan.nextInt();
            if (cur < 4) System.out.println(4-cur);
            else System.out.println(cur%2);
        }
    }
}