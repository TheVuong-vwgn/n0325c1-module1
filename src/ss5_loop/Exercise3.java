package ss5_loop;

import java.util.Scanner;

/**
 * In dãy số chẳn 2 -> n có giá trị âm dương xen kẻ
 */

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 2) {
            if (i % 4 == 0) {
                System.out.print(-i + "\t ");
            } else {
                System.out.print(i + "\t ");
            }
        }
    }
}
