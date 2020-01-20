import java.util.Scanner;

public class GennadyCardGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String f = scan.nextLine();
        String t = scan.nextLine();
        char r = f.charAt(0), s = f.charAt(1);
        for (int i = 0; i < t.length(); i += 3) {
            if (t.charAt(i) == r || t.charAt(i+1) == s) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}