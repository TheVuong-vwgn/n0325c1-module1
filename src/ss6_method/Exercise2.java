package ss6_method;

import java.util.Scanner;

/**
 * Phương thức nhận vào 1 số nguyên n và thực hiện
 * a. Trả về số đảo của số đó
 * b. Có phải là số đối xứng
 * c. Có phải là số chính phương
 * d. Có phải là số nguyên tố
 * e. Tổng các chữ số lẻ
 * f. Tổng các chữ số nguyên tố
 * g. Tổng các chữ số chính phương
 */

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhập số nguyên dương n: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Bạn hãy nhập số nguyên dương (n > 0), vui lòng nhập lại!!!");
            }
        } while (n <= 0);

        System.out.printf("Số %d sau khi đảo ngược là: %d", n, reversedNumber(n));

        if (isSymetricalNumber (n)) {
            System.out.printf("Số %d là số đối xứng\n", n);
        } else {
            System.out.printf("Số %d không phải là số đối xứng\n", n);
        }

        if (isSquareNumber(n)) {
            System.out.printf("Số %d là số chính phương\n", n);
        } else {
            System.out.printf("Số %d không phải là số chính phương\n", n);
        }

        if (isPrimeNumber(n)) {
            System.out.printf("Số %d là số nguyên tố\n", n);
        } else {
            System.out.printf("Số %d không phải là số nguyên tố\n", n);
        }

        System.out.printf("Tổng các số lẻ của số %d = %d\n", n, calculateTotalOddDigits(n));
        System.out.printf("Tổng các số nguyên tố = %d\n", calculateTotalPrimeDigits(n));
        System.out.printf("Tổng các số chính phương = %d\n", calculateTotalSquareDigits(n));
    }

    public static int reversedNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return reverse;
    }

    public static boolean isSymetricalNumber(int n) {
        return n == reversedNumber(n);
    }

    public static boolean isSquareNumber (int n) {
       return Math.sqrt(n) % 1 == 0;
    }

    public static boolean isPrimeNumber(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int calculateTotalOddDigits(int n) {
        int total = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                total += digit;
            }
            n /= 10;
        }
        return total;
    }

    public static int calculateTotalPrimeDigits(int n) {
        int total = 0;
        while (n != 0) {
            int digit = n % 10;
            if (isPrimeNumber(digit)) {
                total += digit;
            }
            n /= 10;
        }
        return total;
    }

    public static int calculateTotalSquareDigits(int n) {
        int total = 0;
        while (n != 0) {
            int digit = n % 10;
            if (isSquareNumber(digit)) {
                total += digit;
            }
            n /= 10;
        }
        return total;
    }
}
