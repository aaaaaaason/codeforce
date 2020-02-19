import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Arrays;

public class CowAndSnacks {
    static ArrayList<HashSet<Integer>> adj;
    static boolean[] v;
    static int ret = 0, rep = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sCnt = s.nextInt(), gCnt = s.nextInt();
        adj = new ArrayList<>(sCnt+1);
        for (int i = 0; i <= sCnt; i++)
            adj.add(new HashSet<>());

        HashSet<Long> bp = new HashSet<>();
        for (int i = 1; i <= gCnt; i++) {
            int s1 = s.nextInt(), s2 = s.nextInt();
            long key = (((long)Math.min(s1, s2)) << 32) + (long) Math.max(s1, s2);
            if (bp.contains(key)) {
                //System.out.println("bbp: " + s1 + " " + s2);
                rep++;
                continue;
            }
            bp.add(key);
            adj.get(s1).add(s2);
            adj.get(s2).add(s1);
        }
        //System.out.println("bp: " + rep);
        v = new boolean[sCnt+1];
        for (int i = 1; i<= sCnt; i++) {
            if (!v[i]) {
                dfs(i, -1);
            }
        }

        System.out.println((ret/2 + rep));
    }

    private static void dfs(int i, int from) {
        //System.out.println("head: " + i);
        v[i] = true;
        for (int n: adj.get(i)) {
            if (v[n]) {
                if (n != from) {
                    //System.out.println(i + " " + n);
                    ret++;
                }
                continue;
            }
            dfs(n, i);
        }
    }
}