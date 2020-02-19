import java.util.*;

public class FightWithMonsters {
    static int[] ms;
    static int a, b;
    static HashMap<Long,Integer> memo;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        a = s.nextInt();
        b = s.nextInt();
        int k = s.nextInt();

        ms = new int[n];
        for (int i = 0; i < n; i++) {
            ms[i] = s.nextInt();
            ms[i] %= (a + b);
            if (ms[i] == 0) ms[i] = a + b;
            ms[i] = ms[i] / a + (ms[i] % a == 0 ? 0 : 1) - 1;
        }
        //System.out.println(Arrays.toString(ms));
        Arrays.sort(ms);

        int ret = 0;
        for (int i = 0; i < ms.length; i++) {
            if (k < ms[i]) break;
            ret++;
            k -= ms[i];
        }

        System.out.println(ret);
    }
}