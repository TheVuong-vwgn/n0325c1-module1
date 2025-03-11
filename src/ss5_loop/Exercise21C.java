package ss5_loop;

import java.util.Scanner;

/**
 *  Kiểm tra số nguyên dương
 *  c. Các chử số có tăng dần hay không?
 */

public class Exercise21C {
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

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) >= s.charAt(i + 1)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.printf("%d là số có các chữ số tăng dần",n);
        } else {
            System.out.printf("%d không phải là số có các chữ số tăng dần",n);
        }
    }
}
