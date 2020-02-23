import java.util.*;

public class WhiteSheet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] wl = new int[]{s.nextInt(), s.nextInt()}, wr = new int[]{s.nextInt(), s.nextInt()};
        int[] bl = new int[]{s.nextInt(), s.nextInt()}, br = new int[]{s.nextInt(), s.nextInt()};
        int[] cl = new int[]{s.nextInt(), s.nextInt()}, cr = new int[]{s.nextInt(), s.nextInt()};

        int[] il1 = null, ir1 = null, il2 = null, ir2 = null;
        if (br[0] > wl[0] && bl[0] < wr[0]) {
            if (br[1] > wl[1] && bl[1] < wr[1]) {
                il1 = new int[]{Math.max(bl[0], wl[0]), Math.max(bl[1], wl[1])};
                ir1 = new int[]{Math.min(br[0], wr[0]), Math.min(br[1], wr[1])};

                //System.out.println("il1 " + Arrays.toString(il1));
                //System.out.println("ir1 " + Arrays.toString(ir1));

                if (ir1[0] - il1[0] == wr[0] - wl[0] && ir1[1] - il1[1] == wr[1] - wl[1]) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        if (cr[0] > wl[0] && cl[0] < wr[0]) {
            if (cr[1] > wl[1] && cl[1] < wr[1]) {
                il2 = new int[]{Math.max(cl[0], wl[0]), Math.max(cl[1], wl[1])};
                ir2 = new int[]{Math.min(cr[0], wr[0]), Math.min(cr[1], wr[1])};

                //System.out.println("il2 " + Arrays.toString(il2));
                //System.out.println("ir2 " + Arrays.toString(ir2));

                if (ir2[0] - il2[0] == wr[0] - wl[0] && ir2[1] - il2[1] == wr[1] - wl[1]) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        if (il1 == null || il2 == null) {
            System.out.println("YES");
            return;
        }

        if (ir1[0] - il1[0] == wr[0] - wl[0] && ir2[0] - il2[0] == wr[0] - wl[0] &&
            Math.max(il1[1], il2[1]) <= Math.min(ir1[1], ir2[1]) && Math.min(il1[1], il2[1]) == wl[1] &&
            Math.max(ir1[1], ir2[1]) == wr[1]) {
            System.out.println("NO");
            return;
        }

        if (ir1[1] - il1[1] == wr[1] - wl[1] && ir2[1] - il2[1] == wr[1] - wl[1] &&
            Math.max(il1[0], il2[0]) <= Math.min(ir1[0], ir2[0]) && Math.min(il1[0], il2[0]) == wl[0] &&
            Math.max(ir1[0], ir2[0]) == wr[0]) {
            System.out.println("NO");
            return;
        }

        System.out.println("YES");
        s.close();
    }
}