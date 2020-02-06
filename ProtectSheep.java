import java.util.Scanner;
import java.util.Arrays;

public class ProtectSheep {
    static int[][] dirs = new int[][]{
        new int[]{1, 0},
        new int[]{-1, 0},
        new int[]{0, 1},
        new int[]{0, -1}
    };
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt(), c = s.nextInt();
        char[][] m = new char[r][];
        for (int i = 0; i < r; i++)
            m[i] = s.next().toCharArray();

        boolean ret = true;
        DONE:
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (m[i][j] == 'W') {
                    for (int[] d: ProtectSheep.dirs) {
                        int x = i + d[0], y = j + d[1];
                        if (x >= 0 && x < r && y >= 0 && y < c) {
                            if (m[x][y] == 'S') {
                                ret = false;
                                break DONE;
                            } else if (m[x][y] == '.')
                                m[x][y] = 'D';
                        }
                    }
                }
            }
        }

        if (!ret) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
        for (int i = 0; i < r; i++)
            System.out.println(new String(m[i]));

        //for (int i = 0; i < r; i++)
        //    System.out.println(Arrays.toString(m[i]));

    }
}