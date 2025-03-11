package ss5_loop;

import java.util.Scanner;

/**
 *  Tính tổng giai thừa 3 số nguyên dương
 */

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        do {
            System.out.print("Nhập số nguyên dương a: ");
            a = scanner.nextInt();

            if (a <= 0) {
                System.out.println("Bạn hãy nhập số nguyên dương (a > 0), vui lòng nhập lại!!!");
            }
        } while (a <= 0);

        do {
            System.out.print("Nhập số nguyên dương b: ");
            b = scanner.nextInt();

            if (b <= 0) {
                System.out.println("Bạn hãy nhập số nguyên dương (b > 0), vui lòng nhập lại!!!");
            }
        } while (b <= 0);

        do {
            System.out.print("Nhập số nguyên dương c: ");
            c = scanner.nextInt();

            if (c <= 0) {
                System.out.println("Bạn hãy nhập số nguyên dương (c > 0), vui lòng nhập lại!!!");
            }
        } while (c <= 0);

        int factorialA = 1;
        int factorialB = 1;
        int factorialC = 1;

        for (int i = 1; i <= a; i++) {
            factorialA *= i;
        }

        for (int i = 1; i <= b; i++) {
            factorialB *= i;
        }

        for (int i = 1; i <= c; i++) {
            factorialC *= i;
        }

        int s = factorialA + factorialB + factorialC;

        System.out.printf("Tổng giai thừa của %d! + %d! + %d! = %d", a, b, c, s);
    }
}
