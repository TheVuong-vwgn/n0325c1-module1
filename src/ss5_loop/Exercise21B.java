package ss5_loop;

import java.util.Scanner;

/**
 *  Kiểm tra số nguyên dương
 *  b. Có phải là số nguyên tố
 */

public class Exercise21B {
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

        boolean flag = true;

        if (n < 2) {
            flag = false;
        }

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.printf("%d là số nguyên tố",n);
        } else {
            System.out.printf("%d không phải là số nguyên tố",n);
        }
    }
}
