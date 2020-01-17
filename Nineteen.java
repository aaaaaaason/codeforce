import java.util.Scanner;

public class Nineteen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String l = scan.nextLine();

        int[] cnt = new int[26];
        for (char c: l.toCharArray()) {
            cnt[c-'a']++;
        }

        int ret = Integer.MAX_VALUE;
        //System.out.println("n " + cnt['n'-'a'] + " i " + cnt['i'-'a'] +
        //    " e " + cnt['e' - 'a'] + " t " + cnt['t' - 'a']);
        ret = Math.min(ret, cnt['i'-'a']);
        ret = Math.min(ret, cnt['e'-'a']/ 3);
        ret = Math.min(ret, cnt['t'-'a']);

        int nCnt = 0, nIdx = 'n' - 'a';
        if (cnt[nIdx] >= 3) {
            nCnt++;
            cnt[nIdx] -= 3;
            nCnt += cnt[nIdx]/2;
        }

        ret = Math.min(ret, nCnt);
        System.out.println(ret);
    }
}