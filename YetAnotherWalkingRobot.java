import java.util.*;

public class YetAnotherWalkingRobot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int l = s.nextInt();
            String p = s.next();
            HashMap<Long, Integer> m = new HashMap<>();
            int x = 0, y = 0;
            m.put(0L, 0);

            int pl = p.length(), min = Integer.MAX_VALUE, ms = 0, me = 0;
            for (int j = 0; j < pl; j++) {
                switch (p.charAt(j)) {
                    case 'U':
                        y += 1;
                        break;
                    case 'D':
                        y -= 1;
                        break;
                    case 'L':
                        x -= 1;
                        break;
                    case 'R':
                        x += 1;
                        break;
                }

                long key = (((long)x) << 32) + (long) y;
                Integer last = m.get(key);
                if (last != null && min > j + 1 - last) {
                    min = j + 1 - last;
                    ms = last + 1; me = j + 1;
                }
                m.put(key, j + 1);
            }

            if (min == Integer.MAX_VALUE) System.out.println(-1);
            else System.out.println(ms + " " + me);
        }
    }
}