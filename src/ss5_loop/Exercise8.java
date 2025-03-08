package ss5_loop;

import java.util.Scanner;

/**
 * In dãy số 1,3,7,15,31,...,n
 */

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        int a = 1;

        while (a <= n) {
            System.out.print(a + "\t");
            a = 2 * a + 1;
        }
    }
}
