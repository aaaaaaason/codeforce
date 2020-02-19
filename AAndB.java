import java.util.*;

public class AAndB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int c = 0; c < n; c++) {
            int a = s.nextInt(), b = s.nextInt();

            if (a == b) {
                System.out.println(0);
                continue;
            }

            long sm = Math.min(a, b), la = Math.max(a, b);
            int i = 1, cnt = 0;
            while (sm < la || (sm - la) % 2 == 1) {
                sm += i;
                i++;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}