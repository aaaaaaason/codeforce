import java.util.*;

public class TilePainting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
		for (long i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				while (n % i == 0) n /= i;
				System.out.println(n == 1 ? i : 1);
				return;
            }
        }
		System.out.println(n);
    }

}