package ss5_loop;

import java.util.Scanner;

/**
 *  Kiểm tra số nguyên dương
 *  a. Có phải là số đối xứng
 */

public class Exercise21A {
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

        String s = Integer.toString(n);

        boolean flag = true;

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.printf("%d là số đối xứng",n);
        } else {
            System.out.printf("%d là số không đối xứng",n);
        }
    }
}
