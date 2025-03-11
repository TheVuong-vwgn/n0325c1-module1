package ss5_loop;

import java.util.Scanner;

/**
 *   Hình a:     Hình b:     Hình c:
 *   * * * * *   * * * * *   *       *
 *   *                   *   *       *
 *   *                   *   *       *
 *   *                   *   *       *
 *   * * * * *   * * * * *   * * * * *
 */

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài cạnh hình hộp: ");
        int n = scanner.nextInt();

        System.out.println("Hình a: ");
        for (int i = 1; i <= n; i++){// vòng lặp cha: hàng
            for (int j = 1; j <= n; j++){// vòng lặp con: cột
                if (i == 1 || i == n || j == 1) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        System.out.println("Hình b: ");
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Hình c: ");
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == n || j == 1 || j == n || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
