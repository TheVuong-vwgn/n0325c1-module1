package ss3_java_overview;

import java.util.Scanner;

/**
 * Tính
 */

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quotient = (double) a / b; // dùng double để có thể chia ra số thập phân ép trc vì double trong ngoặc

        System.out.println("Tổng hai số a và b là: " + sum);
        System.out.println("Hiệu hai số a và b là: " + difference);
        System.out.println("Tích hai số a và b là: " + product);
        System.out.println("Thương hai số a và b là: " + quotient);
    }
}
