package ss6_method;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        boolean primeDigit = isPrime(n);
        if (primeDigit){
            System.out.printf("%d là số nguyên tố", n);
        } else {
            System.out.printf("%d không phải là số nguyên tố \n", n);
        }

        int total = sum(n);

        System.out.println("Tổng số nguyên tố là: " + total);
    }

    public static boolean isPrime(int n) {
        boolean flag = true;

        if (n < 2) {
            flag = false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static int sum(int n) {
        int total = 0;
        while (n != 0) {
            if (isPrime(n % 10)) {
                total += n % 10;
            }
            n /= 10;
        }
        return total;
    }
}
