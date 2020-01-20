import java.util.Scanner;
import java.util.HashMap;

public class HitTheLottery {

    int[] ch;

    public static void main(String[] args) {
        HitTheLottery obj = new HitTheLottery();
        obj.run();
    }

    public HitTheLottery () {
        ch = new int[]{100, 20, 10, 5, 1};
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = 0;
        for (int c: ch) {
            ret += n / c;
            n %= c;
        }
        System.out.println(ret);
    }
}