import java.util.Scanner;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[4];
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = scan.nextInt();
            if (max < cur) max = cur;
            nums[i] = cur;
        }

        StringBuilder o = new StringBuilder();
        for (int n: nums) {
            if (n == max) continue;
            o.append(Integer.toString(max - n) + " ");
        }

        System.out.println(o.substring(0, o.length()-1));
    }
}