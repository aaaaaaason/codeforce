import java.util.*;

public class SwapLetters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[] ca = s.next().toCharArray(), cb = s.next().toCharArray();

        List<Integer> ab = new ArrayList<>(n), ba = new ArrayList<>(n);
        int aCnt = 0, bCnt = 0;
        for (int i = 0; i < n; i++) {
            if (ca[i] == 'a') aCnt++;
            else bCnt++;
            if (cb[i] == 'a') aCnt++;
            else bCnt++;

            if (ca[i] == 'a' && cb[i] == 'b') ab.add(i+1);
            else if (ca[i] == 'b' && cb[i] == 'a') ba.add(i+1);
        }

        if (aCnt % 2 == 1 || bCnt % 2 == 1) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();

        int ret = 0;

        for (int i = 0; i+1 < ab.size(); i += 2) {
            sb.append(String.format("%d %d\n", ab.get(i), ab.get(i+1)));
            ret++;
        }

        for (int i = 0; i+1 < ba.size(); i += 2) {
            sb.append(String.format("%d %d\n", ba.get(i), ba.get(i+1)));
            ret++;
        }

        if (ab.size() % 2 == 1) {
            sb.append(String.format("%d %d\n", ab.get(ab.size()-1), ab.get(ab.size()-1)));
            sb.append(String.format("%d %d\n", ab.get(ab.size()-1), ba.get(ba.size()-1)));
            ret += 2;
        }

        System.out.println(ret);
        System.out.print(sb.toString());

        s.close();
    }
}