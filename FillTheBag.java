import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;

public class FillTheBag {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        for (int i = 0; i < c; i++) {
            long n = s.nextLong();
            int m = s.nextInt();

            int[] cnt = new int[65];
            int[] cMap = new int[65];
            HashMap<Integer,Integer> hm = new HashMap<>();
            for (int j = 0, v = 1; j < 32; j++, v*=2) {
                cMap[j] = v;
                hm.put(v, j);
            }

            long sum = 0;
            for (int j = 0; j < m; j++) {
                int tmp = s.nextInt();
                cnt[hm.get(tmp)]++;
                sum += (long)tmp;
            }

            //System.out.println(Long.toBinaryString(n));
            //System.out.println(Long.toBinaryString(sum));

            if (n > sum) {
                System.out.println(-1);
                continue;
            }

            int ret = 0;
            for (int b = 0; b < 64; b++) {
                boolean isSet = (n & (1L << b)) > 0;
                //System.out.println(Arrays.toString(cnt));
                if (isSet) {
                    //System.out.println(b);
                    if (cnt[b] > 0) {
                        cnt[b]--;
                        cnt[b+1] += cnt[b] / 2;
                    } else {
                        int shift = b + 1;
                        while (shift < 65 && cnt[shift] == 0) shift++;
                        cnt[shift]--;
                        ret += shift - b;
                        while (--shift >= b)
                            cnt[shift]++;
                    }

                } else {
                    cnt[b+1] += cnt[b] / 2;
                }
            }

            System.out.println(ret);
        }

        s.close();
    }
}