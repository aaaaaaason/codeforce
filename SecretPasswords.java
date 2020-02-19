import java.util.Scanner;
import java.util.HashSet;

public class SecretPasswords {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int wCnt = s.nextInt();

        int[] cand = new int[26];
        int[] next = new int[26];
        int[] tmp;
        int candCnt = 0;
        for (int i = 0; i < wCnt; i++) {
            String cur = s.next();
            int bm = 0;
            for (int j = 0; j < cur.length(); j++) {
                bm |= 1 << (cur.charAt(j) - 'a');
            }

            int nIdx = 0;
            for (int j = 0; j < candCnt; j++) {
                if ((cand[j] & bm) > 0) {
                    bm |= cand[j];
                } else {
                    next[nIdx++] = cand[j];
                }
            }
            next[nIdx++] = bm;

            tmp = cand;
            cand = next;
            candCnt = nIdx;
            next = tmp;
        }

        System.out.println(candCnt);
    }
}