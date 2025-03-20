package ss7_string;

import java.util.Scanner;

public class Main4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;

        do {
            System.out.print("Nhập vào số lượng phần tử của mảng: ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Số lượng phần tử của mảng >= 0, vui lòng kiểm tra lại!!!");
            }
        } while (n < 0);

        int[] arr = new int[n];

        inputArr(arr);
        outputArr(arr);

//        boolean isValid = true;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                System.out.println("Mảng không toàn chẳn");
//                isValid = false;
//                break;
//            }
//        }
//
//        if (isValid) {
//            System.out.println("Mảng toàn chẳn");
//        }
        if (isAllEven(arr)) {
            System.out.println("Mảng toàn chẳn");
        } else {
            System.out.println("Mảng không toàn chẳn");
        }
    }

    static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào phần tử arr[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
    }

    static void outputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
    }

    static boolean isAllEven(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
