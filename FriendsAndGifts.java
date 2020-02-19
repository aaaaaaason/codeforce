import java.util.*;

public class FriendsAndGifts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean[] gave = new boolean[n+1];
        int[] arr = new int[n+1];
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            int cur = s.nextInt();
            if (cur == 0)
                hs.add(i);
            else
                gave[cur] = true;
            arr[i] = cur;
        }

        List<Integer> l = new LinkedList<>();
        List<Integer> arb = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (!gave[i]) {
                if (hs.contains(i)) {
                    l.add(i);
                } else
                    arb.add(i);
            }
        }

        if (l.size() == 1) {
            arr[l.get(0)] = arb.get(0);
            arb.set(0, l.get(0));
        } else if (l.size() > 1) {
            int pre = -1, init = 0;
            for (int i: l) {
                if (pre == -1)
                    init = pre = i;
                else {
                    arr[pre] = i;
                    pre = i;
                }
            }
            arr[pre] = init;
        }

        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = arb.iterator();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 0) sb.append(Integer.toString(arr[i]) + " ");
            else sb.append(Integer.toString(it.next()) + " ");
        }
        System.out.println(sb.toString());

    }
}