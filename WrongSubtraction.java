import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int k = scan.nextInt();
        scan.close();

        while (k-- > 0) {
            if (num % 10 > 0) num--;
            else num /= 10;
        }

        System.out.println(num);
    }
}