package ss5_loop;

import java.util.Scanner;

/**
 *   * * * * *
 *     *
 *       *
 *         *
 *   * * * * *
 *   * * * * *
 *         *
 *       *
 *     *
 *   * * * * *
 */

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài cạnh: ");
        int n = scanner.nextInt();

        System.out.println("Hình a: ");
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Hình b: ");
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == n - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
