import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class StudentsAndShoelaces {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vc = s.nextInt(), ec = s.nextInt();
        ArrayList<Set<Integer>> adj = new ArrayList<>(vc+1);
        for (int i = 0; i <= vc; i++)
            adj.add(new HashSet<>());

        for (int i = 0; i < ec; i++) {
            int f = s.nextInt(), t = s.nextInt();
            adj.get(f).add(t);
            adj.get(t).add(f);
        }

        Queue<Integer> q = new LinkedList<>();
        int cnt = 0;
        while (true) {

            for (int i = 1; i <= vc; i++) {
                if (adj.get(i).size() == 1)
                    q.offer(i);
            }

            int size = q.size();
            if (size == 0) break;

            for (int i = 0; i < size; i++) {
                int f = q.poll();
                for (int t: adj.get(f)) {
                    Set<Integer> ts = adj.get(t);
                    ts.remove(f);
                }
                adj.get(f).clear();
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}