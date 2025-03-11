package ss5_loop;

import java.util.Scanner;

/**
 *   In các hình tam giác bằng dấu *
 */


public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chiều dài cạnh hình tam giác: ");
        int n = scanner.nextInt();

        System.out.println("Hình a: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Hình b: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Hình c: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1;k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Hình d: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1;k <= n - i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Hình e: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1;j <= n - i + 1; j++) {
                if (i == 1 || j == 1 || i == n - j + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Hình f: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1;k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Hình g: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1;k <= (n - i) * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
