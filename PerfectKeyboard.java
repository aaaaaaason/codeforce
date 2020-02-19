import java.util.*;

public class PerfectKeyboard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
NEXT_CASE:
        for (int i = 0; i < n; i++) {
            ArrayList<HashSet<Integer>> adj = new ArrayList<>(26);
            for (int j = 0; j < 26; j++) adj.add(new HashSet<>());
            char[] pw = s.next().toCharArray();
            HashSet<Character> pws = new HashSet<>();

            //System.out.println(Arrays.toString(pw));

            for (int j = 0; j < pw.length; j++) {
                pws.add(pw[j]);
                int idx = pw[j] - 'a';
                HashSet<Integer> cs = adj.get(idx);

                if (j - 1 >= 0)
                    cs.add(pw[j-1] - 'a');
                if (j + 1 < pw.length)
                    cs.add(pw[j+1] - 'a');
                if (cs.size() > 2) {
                    System.out.println("NO");
                    continue NEXT_CASE;
                }
            }

            StringBuilder sb = new StringBuilder();
            boolean[] v = new boolean[26];
            for (int j = 0; j < 26; j++) {
                if (v[j]) continue;
                StringBuilder buf = new StringBuilder();

                if (pws.contains((char)(j+'a')) && adj.get(j).size() <= 1) {
                    if (dfs(adj, v, j, -1, buf))
                        sb.append(buf.toString());
                }
            }

            if (pws.size() != sb.length()) {
                System.out.println("NO");
                continue NEXT_CASE;
            }

            for (int j = 0; j < 26; j++) {
                if (v[j]) continue;
                sb.append((char)(j + 'a'));
            }

            System.out.println("YES");
            System.out.println(sb.toString());
        }
    }

    private static boolean dfs(ArrayList<HashSet<Integer>> adj, boolean[] v, int i, int from, StringBuilder buf) {
        v[i] = true;
        buf.append((char)(i+'a'));
        for (int t: adj.get(i)) {
            if (t == from) continue;
            if (v[t]) return false;
            if (!dfs(adj, v, t, i, buf))
                return false;
        }
        return true;
    }
}