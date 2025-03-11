package ss5_loop;

import java.util.Scanner;

/**
 * Chuyển đổi số nguyên dương thành số nhị phân
 */

public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập số nguyên dương (n > 0): ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Bạn hãy nhập số nguyên dương (n > 0), vui lòng nhập lại!!!");
            }
        } while (n <= 0);

        String binary = "";

        while (n > 0) {
            int x = n % 2;
            binary = x + binary;
            n /= 2;
        }

        System.out.println("Sau khi đổi sang nhị phân: " + binary);
    }
}
