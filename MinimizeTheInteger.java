import java.util.*;

public class MinimizeTheInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        for (int t = 0; t < tc; t++) {
            LinkedList<Integer> odd = new LinkedList<>(), even = new LinkedList<>();
            String str = s.next();
            for (int i = 0; i < str.length(); i++) {
                int cur = str.charAt(i) - '0';
                if (cur % 2 == 0) even.add(cur);
                else odd.add(cur);
            }

            StringBuilder sb = new StringBuilder();
            Iterator<Integer> oit = odd.iterator(), eit = even.iterator();
            int o = -1, e = -1;
            while (oit.hasNext() || eit.hasNext()) {
                if (o == -1) o = oit.hasNext()? oit.next() : Integer.MAX_VALUE;
                if (e == -1) e = eit.hasNext()? eit.next() : Integer.MAX_VALUE;
                if (e <= o) {
                    sb.append(Integer.toString(e));
                    e = -1;
                } else {
                    sb.append(Integer.toString(o));
                    o = -1;
                }
            }

            if (e != -1 && e != Integer.MAX_VALUE) sb.append(Integer.toString(e));
            else if (o != -1 && o != Integer.MAX_VALUE) sb.append(Integer.toString(o));

            System.out.println(sb.toString());
        }
    }
}