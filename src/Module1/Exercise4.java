package Module1;

import java.util.Scanner;

/**
 *
 */
public class Exercise4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;

        do {
            System.out.print("Nhập vào số lượng phân tử của mảng: ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Số lượng phần tử mảng không hợp lệ (n >= 0 hoặc n <= 20)!! Vui lòng kiểm tra lại!!");
            }
        } while (n < 0);

        int[] arr = new int[n];
        inputArr(arr);
        outputArr(arr);


    }
    static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào phần tử arr[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
    }

    static void outputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t\n", arr[i]);
        }
    }

    static boolean isPrime (int n) {
        if (n < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

    static int[] getPrimeFromArray(int[] arr) {
        // B1: Đếm số lượng số nguyên tố
        int coutPrime = 0;

        for (int item : arr) {
            if (isPrime(item)) {
               coutPrime++;
            }
        }
        // B2: Tạo mảng với số lượng số nguyên tố
        int[] primeArr = new int[coutPrime];

        // B3: Đưa số nguyên tố ào mảng vừa tạo
        int indexPrimeArr = 0;
        for (int item : arr) {
            if (isPrime(item)) {
                primeArr[indexPrimeArr++] = item;
            }
        }
        return primeArr;
    }
}

