import java.util.Scanner;

public class AntonPolyhedrons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int ret = 0;

        scan.nextLine();
        for (int i = 0; i < cnt; i++) {
            String h = scan.nextLine();
            switch(h) {
                case "Tetrahedron":
                    ret += 4;
                    break;
                case "Cube":
                    ret += 6;
                    break;
                case "Octahedron":
                    ret += 8;
                    break;
                case "Dodecahedron":
                    ret += 12;
                    break;
                case "Icosahedron":
                    ret += 20;
                    break;
            }
        }
        System.out.println(ret);
    }
}