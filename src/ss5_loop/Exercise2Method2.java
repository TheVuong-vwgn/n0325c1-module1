package ss5_loop;

import java.util.Scanner;

/**
 * In dãy số lẽ
 */

public class Exercise2Method2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + "\t ");
        }
    }
}
