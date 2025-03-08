package ss4_condision;

import java.util.Scanner;

/**
 * Giải phuong trình bậc 2 ?
 */

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hai số nguyên: ");

        System.out.print("Nhập a = ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b = ");
        double b = scanner.nextDouble();

        System.out.print("Nhập c = ");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô sô nghiệm!!!");
                } else {
                    System.out.println("Phương trình vô nghiệm!!!");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiệm của phương trình là: " + x);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm!!!");
            } else if (delta == 0) {
                double x = -b / (2 * a);

                System.out.println("Phương trình có một nghiệm duy nhất: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Phương trình có hai nghiệm: x1 = " + x1 + " và x2 = " + x2);
            }
        }
    }
}
