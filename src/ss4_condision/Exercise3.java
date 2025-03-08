package ss4_condision;

import java.util.Scanner;

/**
 * Đảo giá trị a ,b
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hai số nguyên: ");

        System.out.print("Nhập a = ");
        int a = scanner.nextInt();

        System.out.print("Nhập b = ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Sau khi đảo giá trị: ");
        System.out.println("a = " + a + " ; " + "b = " + b);
    }
}
