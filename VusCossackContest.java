import java.util.Scanner;

public class VusCossackContest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), m = scan.nextInt(), k = scan.nextInt();

        if (n > Math.min(m, k))
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}