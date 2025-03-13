package ss6_method;

import java.util.Scanner;

/**
 * a. Viết phương thức đổi một ký tự hoa sang ký tự thường
 * b. Viết phương thức giải phương trình bậc 1
 * c. Viết phương thức giải phương trình bậc 2
 * d. Viết phương thức trả về giá trị nhỏ nhất của 4 số nguyên
 */

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ký tự: ");
        char C = scanner.next().charAt(0);

        System.out.print("Nhập a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập b: ");
        int b = scanner.nextInt();

        System.out.print("Nhập c: ");
        int c = scanner.nextInt();

        System.out.print("Nhập d: ");
        int d = scanner.nextInt();

        System.out.println("Sau khi chuyển ký tự về chữ thường: " + toLowerCase(C));
        levelOne(a, b);
        levelTwo(a, b, c);
        System.out.printf("Số nhỏ nhất trong 4 số %d, %d, %d, %d là: %d", a, b, c, d, min(a, b, c, d));
    }

    public static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            c += 32;
        }
        return c;
    }

    public static void levelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm!!");
            } else {
                System.out.println("Phương trình vô nghiệm!!");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là: " + x);
        }
    }

    public static void levelTwo(double a, double b, double c) {
        if (a == 0) {
            levelOne(b, c);
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / a * c;
                System.out.println("Phương trình có một nghiệm duy nhât: " + x);
            } else {
                double sqrtDel = Math.sqrt(delta);

                double x1 = (-b + sqrtDel) / (2 * a);
                double x2 = (-b - sqrtDel) / (2 * a);

                System.out.println("Phương trình có hai nghiệm: x1 = " + x1 + " và x2 = " + x2);
            }
        }
    }

    public static int min(int a, int b, int c, int d) {
        int min1 = Math.min(a, b);
        int min2 = Math.min(c, d);

        return Math.min(min1, min2);
    }
}
