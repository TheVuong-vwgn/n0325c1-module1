package ss5_loop;

import java.util.Scanner;

/**
 * Tính tổng S = 1 + 1/2 + 1/3 + 1/4 +...+ 1/n
 */

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        double s = 0.0;

        for (int i = 1 ; i <= n; i++) {

            int fact = 1;

            for (int j = 1; j <= (2 * i - 1); j++) {
                fact *= j;
            }
            s += 1.0 / fact;
        }
        System.out.println("Tổng S = " + s);
    }
}

