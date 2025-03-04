package C5;
import java.util.Scanner;
public class backtrack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu valoarea lui n:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        int[] perm = new int[n];
        boolean[] used = new boolean[n];

        permutari(nums, perm, used, 0, n);

        scanner.close();
    }
   
    public static void permutari(int[] nums, int[] perm, boolean[] used, int index, int n) {
        if (index == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(perm[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                perm[index] = nums[i];
                used[i] = true;

                permutari(nums, perm, used, index + 1, n);

                used[i] = false;
            }
    }
    
 }
}
