import java.util.Scanner;

public class MahmoudEhabGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0) System.out.println("Mahmoud");
        else System.out.println("Ehab");
    }
}