package ss3_java_overview;

import java.util.Scanner;

public class BasicMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào số nguyên b: ");
        int b = scanner.nextInt();

        int sum = a + b;
    }
}
