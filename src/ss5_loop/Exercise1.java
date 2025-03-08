package ss5_loop;

import java.util.Scanner;

/**
 * In dãy số 1,2,3,4...,n
 */

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " \t ");
        }
    }
}
