package ss4_condision;

import java.util.Scanner;

/**
 * Giải phương trình bậc 1 ?
 */

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a = ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b = ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô sô nghiệm!!!");
            } else {
                System.out.println("Phương trình vô nghiệm!!!");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình " + a + "x + " + b + " = 0 " + "là: " + x);
        }
    }
}
