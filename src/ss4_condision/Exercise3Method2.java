package ss4_condision;

import java.util.Scanner;

public class Exercise3Method2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hai số nguyên: ");

        System.out.print("Nhập a = ");
        int a = scanner.nextInt();

        System.out.print("Nhập b = ");
        int b = scanner.nextInt();

        a = a + b; // a = 1 + 2 = 3
        b = a - b; // b = 3 - 2 = 1
        a = a - b; // a = 3 - 1 = 2

        System.out.println("Sau khi đảo giá trị: ");
        System.out.println("a = " + a + " ; " + "b = " + b);
    }
}
