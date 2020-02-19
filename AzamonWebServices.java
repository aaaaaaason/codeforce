import java.util.*;

public class AzamonWebServices {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int c = 0; c < n; c++) {
            String cur = s.next(), oth = s.next();
            char[] cc = cur.toCharArray();
            char[] ccs = cur.toCharArray();
            Arrays.sort(ccs);
            LOOP:
            for (int i = 0; i < cc.length; i++) {
                if (ccs[i] != cc[i]) {
                    for (int j = cc.length-1; j >= 0; j--) {
                        if (cc[j] == ccs[i]) {
                            swap(cc, i, j);
                            break LOOP;
                        }
                    }
                }
            }

            String tmp = new String(cc);
            if (tmp.compareTo(oth) < 0)
                System.out.println(new String(tmp));
            else
                System.out.println("---");
        }
    }

    private static void swap(char[] a, int i, int j) {
        char s = a[i];
        a[i] = a[j];
        a[j] = s;
    }
}