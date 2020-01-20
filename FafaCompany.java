import java.util.Scanner;

public class FafaCompany {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int to = (int) Math.sqrt(n);
        int ret = 1;
        for (int i = 2; i <= to; i++) {
            if (n % i == 0) ret += 2;
        }

        if (to*to == n) ret -= 1;

        System.out.println(ret);
    }
}