package ss4_condision;

import java.util.Scanner;

public class Exercise4Method2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hai số nguyên: ");

        System.out.print("Nhập a = ");
        int a = scanner.nextInt();

        System.out.print("Nhập b = ");
        int b = scanner.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số nhỏ nhất là: " + min);
    }
}
