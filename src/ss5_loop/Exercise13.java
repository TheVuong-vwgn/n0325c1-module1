package ss5_loop;

import java.util.Scanner;

/**
 * Tìm ước chung lớn nhất và bội số chung nhỏ nhất của 2 số nguyên dương
 */

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên dương b: ");
        int b = scanner.nextInt();

        int uscln = 1;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                uscln = i;
                break;
            }
        }

        int bscnn;
        for (int i = a; true; i++) {
            if (i % a == 0 && i % b == 0) {
                bscnn = i;
                break;
            }
        }

        System.out.println("Ước số chung lơn nhất của " + a + " và " + b + " là: " + uscln);
        System.out.println("Bội số chung nhỏ nhất của " + a + " và " + b + " là: " + bscnn);
    }
}
