import java.util.*;

public class TheNumberOfProducts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();

        int pos = 0, neg = 0;

        if (arr[0] > 0) pos++;
        else neg++;

        long tp = pos, tn = neg;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
                tp += pos;
                tn += neg;
            } else {
                int tmp = neg;
                neg = pos + 1;
                pos = tmp;
                tp += pos;
                tn += neg;
            }
        }

        System.out.println(tn + " " + tp);

        s.close();
    }
}