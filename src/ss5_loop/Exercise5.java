package ss5_loop;

import java.util.Scanner;

/**
 * In dãy số chẳn 2 đến 2n
 */

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= 2 * n; i += 2) {
            System.out.print(i + "\t ");
        }
    }
}
