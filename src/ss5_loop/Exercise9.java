package ss5_loop;

import java.util.Scanner;

/**
 * In dãy số 1,-3,7,-15,31,...,n
 */

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        int a = 1;
        int d = 1; // đặt biến dấu

        while (a <= n) {
            System.out.print(a * d + "\t");
            a = 2 * a + 1;
            d = -d;
        }
    }
}
