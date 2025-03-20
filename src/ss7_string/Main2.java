package ss7_string;

import java.util.Scanner;

public class Main2 {
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

        // B2: Tạo ra mảng có n phần tử
        int[] arr = new int[n]; // 0 0 0 0

        // B3: Nhập mảng
        inputArr(arr);

        // B4: Xuất mảng
        outputArr(arr);

        // khởi tạo có từ new là đối tương đc lưu ở heap địa chỉ: oxabc1234 giá trị: õabc2345
    }
    static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // 0 1 2 3 4
            System.out.printf("Nhập vào phần tử arr[%d]: ", i);
            arr[i] = scanner.nextInt();  // [1 2 3 4 5]
        }
    }

    static void outputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
    }
}
