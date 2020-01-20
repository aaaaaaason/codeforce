import java.util.Scanner;

public class InSearchEasyProblem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pCnt = scan.nextInt();
        for (int i = 0; i < pCnt; i++) {
            int status = scan.nextInt();
            if (status != 0) {
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}