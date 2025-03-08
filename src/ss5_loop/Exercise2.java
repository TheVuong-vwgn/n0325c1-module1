package ss5_loop;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\t ");
            }
        }
    }
}
