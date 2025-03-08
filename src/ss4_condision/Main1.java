package ss4_condision;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập n: ");
        int n = scanner.nextInt();
        // Cách 1:
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " \t ");
            }
        }
        // Cách 2:
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i + " \t ");
        }
    }
}
// git add .
// git commit -m "Câu lệnh điều kiện"
// git push
