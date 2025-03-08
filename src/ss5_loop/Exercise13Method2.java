package ss5_loop;

import java.util.Scanner;

/**
 * Tìm ước chung lớn nhất và bội số chung nhỏ nhất của 2 số nguyên dương
 */

public class Exercise13Method2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên dương b: ");
        int b = scanner.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int uscln = 1;
        if (max % min == 0) {
            uscln = min;
        } else {
            // Vòng lặp bắt đầu từ i = min / 2  ( vì trong trong min / 2 không bao giờ chia hết cho min)
            for (int i = min / 2; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    uscln = i;
                    break;
                }
            }
        }

        int bscnn;
        for (int i = max; true; i += max) { // cho i chạy từ max và bước lặp là max
            if (i % min == 0) {
                bscnn = i;
                break;
            }
        }

        System.out.println("Ước số chung lơn nhất của " + a + " và " + b + " là: " + uscln);
        System.out.println("Bội số chung nhỏ nhất của " + a + " và " + b + " là: " + bscnn);
    }
}
