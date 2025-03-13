package ss6_method;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a : ");
        int a = scanner.nextInt();
        System.out.print("Nhap b : ");
        int b = scanner.nextInt();

        System.out.println("Ước chung lớn nhất là: " + USCLN(a, b));
    }
    public static int USCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
