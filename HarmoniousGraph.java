import java.util.Scanner;
import java.util.HashSet;

public class HarmoniousGraph {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int vCnt = s.nextInt();
        int eCnt = s.nextInt();

        int[] v = new int[vCnt+1];

        //HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < eCnt; i++) {
            int v1 = s.nextInt(), v2 = s.nextInt();
            //hs.add(v1); hs.add(v2);

            if (v[v1] == 0) v[v1] = v1;
            if (v[v2] == 0) v[v2] = v2;

            int p1 = findParent(v, v1), p2 = findParent(v, v2);
            if (p1 >= p2) v[p2] = p1;
            else v[p1] = p2;
        }

        int i = 0, ret = 0;
        while (++i < v.length) {
            if (v[i] == 0) continue;

            int idxp = 0, p = findParent(v, i);
            while (++i < p) {

                if (v[i] == 0) {
                    ret++;
                    continue;
                }

                idxp = findParent(v, i);
                if (idxp == p) continue;

                ret++;
                if (p >= idxp)
                    v[idxp] = p;
                else {
                    v[p] = idxp;
                    p = idxp;
                }
            }
        }

        System.out.println(ret);
    }

    private static int findParent(int[] v, int i) {
        if (v[i] != i)
            v[i] = findParent(v, v[i]);
        return v[i];
    }
}