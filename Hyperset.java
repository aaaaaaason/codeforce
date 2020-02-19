import java.util.*;

public class Hyperset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), k = s.nextInt();
        char[][] ss = new char[n][k];
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String tmp = s.next();
            ss[i] = tmp.toCharArray();
            hs.add(tmp);
        }

        int ret = 0;
        char[] buf = new char[k];
        char[] map = new char[256+256];
        map['S' + 'E'] = 'T'; map['E' + 'T'] = 'S'; map['S' + 'T'] = 'E';
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = 0; l < k; l++) {
                    if (ss[i][l] == ss[j][l])
                        buf[l] = ss[i][l];
                    else
                        buf[l] = map[ss[i][l]+ss[j][l]];
                }
                if (hs.contains(new String(buf)))
                    ret++;
            }
        }
        System.out.println(ret/3);
    }
}