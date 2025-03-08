package ss4_condision;

import java.util.Scanner;

/**
 * Tìm số lớn nhất a, b ?
 */

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a = ");
        int a = scanner.nextInt();

        System.out.print("Nhập b = ");
        int b = scanner.nextInt();

        int max, min;

        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }

        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số nhỏ nhất là: " + min);
    }
}
