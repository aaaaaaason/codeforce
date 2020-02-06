import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Badge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++)
            arr[i] = s.nextInt();

        boolean[] v = new boolean[n+1];
        int[] ret = new int[n+1];
        for (int i = 1; i <= n; i++) {
            if (v[i]) continue;
            v[i] = true;

            int slow = i, fast = i;
            while (true) {
                slow = arr[slow];
                fast = arr[arr[fast]];
                v[slow] = true;
                v[fast] = true;
                //System.out.println(slow + " " + fast);
                if (slow == fast)
                    break;
            }

            int head = i;
            while (true) {
                //System.out.println(head + " " + slow);
                if (head == slow) {
                    head = i;
                    while (head != slow) {
                        ret[head] = slow;
                        head = arr[head];
                    }

                    while (ret[head] == 0) {
                        ret[head] = head;
                        head = arr[head];
                    }

                    break;
                }

                head = arr[head];
                slow = arr[slow];
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(Integer.toString(ret[i]));
            sb.append(" ");
        }
        System.out.println(sb.substring(0, sb.length()-1));
    }
}