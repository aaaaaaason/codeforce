import java.util.*;

public class MakeGood {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int c = 0; c < n; c++) {
            int l = s.nextInt();
            long sum = 0, xor = 0;
            for (int i = 0; i < l; i++) {
                int tmp = s.nextInt();
                sum += tmp;
                xor ^= tmp;
            }

            List<Long> r = new LinkedList<>();
            if (xor % 2 == 1) {
                r.add(1L);
                xor ^= 1;
                sum += 1;
            }

            r.add(xor);
            sum += xor;
            r.add(sum);

            System.out.println(r.size());
            StringBuilder sb = new StringBuilder();
            for (long i: r) sb.append(Long.toString(i) + " ");
            System.out.println(sb.toString());
        }
    }
}