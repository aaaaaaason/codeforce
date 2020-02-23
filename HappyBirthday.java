import java.util.*;

public class HappyBirthday {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tc = s.nextInt();
        for (int t = 0; t < tc; t++) {
            int[] c = new int[10];

            int min = Integer.MAX_VALUE, minIdx = -1;
            for (int i = 0; i < 10; i++) {
                 c[i] = s.nextInt();
                 if (i > 0 && min > c[i]) {
                     min = c[i];
                     minIdx = i;
                 }
            }

            //System.out.println(min + " " + minIdx);

            if (min == 0) {
                System.out.println(minIdx);
                continue;
            }

            String c1 = Integer.toString(minIdx).repeat(min+1);
            String c2 = "1" + "0".repeat(c[0]+1);

            if (c1.length() < c2.length()) System.out.println(c1);
            else System.out.println(c2);

        }
    }
}