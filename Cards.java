import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();

        int[] cnt = new int[26];
        for (int i = 0; i < num; i++)
            cnt[s.charAt(i)-'a']++;

        int oneCnt = Math.min(cnt['o'-'a'], Math.min(cnt['n'-'a'], cnt['e'-'a']));
        //if (oneCnt == 0) {
        //    System.out.println("0");
        //    return;
        //}

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < oneCnt; i++)
            sb.append("1 ");

        cnt['o'-'a'] -= oneCnt;
        cnt['e'-'a'] -= oneCnt;

        int zCnt = Math.min(Math.min(cnt['z'-'a'], cnt['e'-'a']),
            Math.min(cnt['r'-'a'], cnt['o'-'a']));

        for (int i = 0; i < zCnt; i++)
            sb.append("0 ");

        System.out.println(sb.substring(0, sb.length()-1));
    }
}