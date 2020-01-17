import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), p = scan.nextInt(), k = scan.nextInt();

        StringBuilder res = new StringBuilder();

        if (p - k > 1) res.append("<< ");
        for (int i = Math.max(1, p - k); i < p; i++)
            res.append(Integer.toString(i) + " ");
        res.append("(" + Integer.toString(p) + ")");
        for (int i = p + 1; i <= p + k && i <= n; i++)
            res.append(" " + Integer.toString(i));
        if (p + k + 1 <= n) res.append(" >>");

        System.out.println(res.toString());
        scan.close();

    }
}