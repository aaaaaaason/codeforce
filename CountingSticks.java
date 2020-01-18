import java.util.Scanner;

public class CountingSticks {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        scan.close();

        int left = 0, right = 0, ans = 0;
        boolean isRight = false, isAns = false;
        for (int i = 0; i < line.length(); i++) {
            char cur = line.charAt(i);
            if (!isRight) {
                if (cur == '|') left++;
                else if (cur == '+') isRight = true;
            } else if (!isAns) {
                if (cur == '|') right++;
                else if (cur == '=') isAns = true;
            } else if (cur == '|') {
                ans++;
            }
        }

        //System.out.println(left + " " + right + " " + ans);

        String ret = null;
        if (left + right == ans) ret = line;
        else if (left + right + 1 == ans - 1)
            ret = makeRes(left+1, right, ans-1);
        else if (left + right - 1 == ans + 1) {
            if (left > 1) left -= 1;
            else right -= 1;
            ret = makeRes(left, right, ans+1);
        } else
            ret = "Impossible";

        System.out.println(ret);
    }

    private static String makeRes(int left, int right, int ans) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < left; i++) sb.append('|');
            sb.append('+');
            for (int i = 0; i < right; i++) sb.append('|');
            sb.append('=');
            for (int i = 0; i < ans; i++) sb.append('|');
            return sb.toString();
    }
}