import java.util.*;

public class RemoveOneElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        int[] ml = new int[n];
        int ret = 1;
        int i = 1, cnt = 1, j = 0;
        while (i <= n) {
            if (i < n && arr[i-1] < arr[i]) {
                cnt++;
                ret = Math.max(ret, cnt);
            } else {
                while (j < i)
                    ml[j++] = cnt--;

                cnt = 1;
            }
            i++;
        }

        //System.out.println(Arrays.toString(ml));

        for (i = 0; i < arr.length - 2; i++) {
            if ((i + ml[i] + 1) < arr.length && arr[i + ml[i] + 1] > arr[i + ml[i] - 1])
                ret = Math.max(ret, ml[i] + ml[i+ ml[i]+1]);
            else if (i + ml[i] < arr.length && i + ml[i] - 2 >= 0 && arr[i + ml[i]] > arr[i + ml[i] - 2])
                ret = Math.max(ret, ml[i] - 1 + ml[i + ml[i]]);
        }

        System.out.println(ret);

    }
}