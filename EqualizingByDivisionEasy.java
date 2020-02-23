
import java.util.*;

public class EqualizingByDivisionEasy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), k = s.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = s.nextInt();

        Arrays.sort(a);

        int[] cnt = new int[200001];
        int[] op = new int[200001];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            int cur = a[i], cop = 0;
            while (true) {
                cnt[cur]++;
                op[cur] += cop;
                if (cnt[cur] == k && min > op[cur]) {
                    //System.out.println(a[i] + " " + op[cur]);
                    min = op[cur];
                }
                if (cur == 0)
                    break;
                cur >>= 1;
                cop++;
            }
        }

        System.out.println(min);
        s.close();
    }
}