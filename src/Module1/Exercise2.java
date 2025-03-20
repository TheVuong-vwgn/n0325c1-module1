package Module1;

import java.util.Scanner;

/**
 *
 */
public class Exercise2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;

        do {
            System.out.print("Nhập vào số lượng phân tử của mảng: ");
            n = scanner.nextInt();

            if (n < 0 || n > 20) {
                System.out.println("Số lượng phần tử mảng không hợp lệ (n >= 0 hoặc n <= 20)!! Vui lòng kiểm tra lại!!");
            }
        } while (n < 0 || n > 20);

        int[] arr = new int[n];
        inputArr(arr);
//        int sumA = 0;
//        int sumB = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                sumA += arr[i];
//            } else {
//                sumB += arr[i];
//            }
//        }
//        System.out.println(sumA - sumB);

        int result = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                result += arr[i];
//            } else {
//                result += arr[i];
//            }
//        }
//        System.out.println(result);

//        for (int item : arr) {
//            if (item % 2 == 0) {
//                result += item;
//            } else {
//                result += item;
//            }
//        }
//        System.out.println(result);

        for (int item : arr) {
            result += item % 2 == 0 ? item : - item;
        }

        System.out.println(result);
    }
    static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào phần tử arr[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
    }
}

