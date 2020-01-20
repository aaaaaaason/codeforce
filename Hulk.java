import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean isHate = true;

        StringBuilder sb = new StringBuilder();
        while (n-- > 1) {
            if (isHate) sb.append("I hate that ");
            else sb.append("I love that ");
            isHate = !isHate;
        }

        if (isHate) sb.append("I hate it");
        else sb.append("I love it");

        System.out.println(sb.toString());
    }
}