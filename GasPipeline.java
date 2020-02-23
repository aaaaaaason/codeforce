
import java.util.*;

public class GasPipeline {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = s.nextInt();
            long a = s.nextLong(), b = s.nextLong();
            char[] cs = s.next().toCharArray();

            int i = 0;
            long curH = 1, total = b;
            while (i < cs.length - 1) {
                //System.out.println(i + " " + curH + " " + total);
                if (cs[i] == cs[i+1]) {
                    total += curH * b + a;
                    i++;
                } else if (cs[i] == '1' && cs[i+1] == '0') {
                    total += curH * b + a;

                    int j = i + 1;
                    long zCnt = 0;
                    while (j < cs.length && cs[j] == '0') {
                        zCnt++;
                        j++;
                    }

                    if (j == cs.length) {
                        total += (zCnt - 1) * b + 2 * a + a * (zCnt - 2);
                        curH = 1;
                        break;
                    } else if (zCnt < 2) {
                        i++;
                        continue;
                    }

                    long down = a * zCnt + 2 * a + zCnt * b + b;
                    long up = a * zCnt + 2 * zCnt * b;
                    if (down <= up) {
                        total += a;
                        curH--;
                    }
                    i++;
                } else {
                    if (curH == 1) {
                        curH++;
                        total += curH * b + 2 * a;
                    } else
                        total += curH * b + a;
                    i++;
                }
            }

            total += b + a;
            System.out.println(total);
        }

        s.close();
    }
}