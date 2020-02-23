import java.util.*;

public class Uniqueness {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = s.nextInt();

        HashSet<Integer> hs = new HashSet<>();
        int l = 0;
        for (; l < n; l++) {
            if (!hs.contains(a[l]))
                hs.add(a[l]);
            else
                break;
        }

        int r = a.length - 1;
        for (; r > l; r--) {
            if (!hs.contains(a[r]))
                hs.add(a[r]);
            else
                break;
        }

        int max = hs.size();

        if (max == n) {
            System.out.println(0);
            return;
        }

        while (--l >= 0) {
            hs.remove(a[l]);
            while (!hs.contains(a[r])) {
                hs.add(a[r]);
                r--;
            }
            if (max < hs.size()) {
                max = hs.size();
            }
        }

        System.out.println(n - max);
        s.close();
    }
}