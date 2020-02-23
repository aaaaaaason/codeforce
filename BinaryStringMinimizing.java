import java.util.*;

public class BinaryStringMinimizing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = s.nextInt();
            long k = s.nextLong();
            char[] cs = s.next().toCharArray();
            StringBuilder sb = new StringBuilder();

            long oneCnt = 0;
            for (int i = 0; i < cs.length; i++) {
                if (cs[i] == '1')
                    oneCnt++;
                else {
                    if (oneCnt > 0) {
                        if (k >= oneCnt) {
                            sb.append("0");
                            k -= oneCnt;
                        } else {
                            sb.append("1".repeat((int)(oneCnt - k)));
                            sb.append("0");
                            sb.append("1".repeat((int)k));
                            sb.append(new String(cs, i+1, cs.length - i - 1));
                            break;
                        }
                    } else
                        sb.append("0");
                }
            }

            if (sb.length() != cs.length) sb.append("1".repeat((int)oneCnt));

            System.out.println(sb.toString());
        }
    }
}